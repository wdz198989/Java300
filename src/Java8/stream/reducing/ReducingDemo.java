package Java8.stream.reducing;


import java.util.*;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;

/**
 * @Author : WuDazhong
 * @Date :2021/1/5 19:44
 * @Description :
 */
public class ReducingDemo {
    /**
     * �������
     *
     * @param args ���в���
     */
    public static void main(String[] args) {
        List<Person> personList = getPersonList(1000000);
        functionStyle(personList);
        normalStyle(personList);
    }

    /**
     * ����ʽ��̷��3�д�����룩
     * @param personList Person �б�
     */
    private static void functionStyle(List<Person> personList) {
        long start = System.currentTimeMillis();
        // ����һ���Ƚ�����ȡ��Ϊ byHeight ��ͨ���߶����Ƚϣ�
        Comparator<Person> byHeight = Comparator.comparingInt(Person::getHeight);
        // ����һ����һ�ռ���
        Map<City, Optional<Person>> tallestByCity = personList.stream().
                collect(groupingBy(Person::getCity, reducing(BinaryOperator.maxBy(byHeight))));
        long usedTime = System.currentTimeMillis() - start;
        printResult("����ʽ��̷��", personList.size(), usedTime, tallestByCity);
    }

    /**
     * ��ͨ��̷��20�д�����룩
     * @param personList Person �б�
     */
    private static void normalStyle(List<Person> personList) {
        long start = System.currentTimeMillis();
        // ����һ�������
        Map<City, Optional<Person>> tallestByCity = new HashMap<>();
        // ��һ�����ҳ����еĲ�ͬ����
        Set<City> cityList = new HashSet<>();
        for (Person person : personList) {
            if (!cityList.contains(person.getCity())) {
                cityList.add(person.getCity());
            }
        }
        // �ڶ������������г��У������������ҳ�ÿ�����е�������
        for (City city : cityList) {
            int maxHeight = 0;
            Person tempPerson = null;
            for (Person person : personList) {
                if (person.getCity().equals(city)) {
                    if (person.getHeight() > maxHeight) {
                        maxHeight = person.getHeight();
                        tempPerson = person;
                    }
                }
            }
            tallestByCity.put(city, Optional.ofNullable(tempPerson));
        }
        long usedTime = System.currentTimeMillis() - start;
        printResult("��ͨ��̷��", personList.size(), usedTime, tallestByCity);
    }

    /**
     * ��ȡPerson�б�
     * @param numbers Ҫ��ȡ������
     * @return ����ָ�������� Person �б�
     */
    private static List<Person> getPersonList(int numbers) {
        // ��������
        final City cityChengDu = new City("�ɶ�");
        final City cityNewYork = new City("ŦԼ");
        List<Person> people = new ArrayList<>();
        // ����ָ��������Person����ָ����ͬ�ĳ��к���Թ̶������ֵ
        for (int i = 0; i < numbers; i++) {
            if (i % 2 == 0) {
                // �ɶ�������185
                people.add(new Person(cityChengDu, 185));
            } else if (i % 3 == 0) {
                people.add(new Person(cityChengDu, 170));
            } else if (i % 5 == 0) {
                // �ɶ���С���160
                people.add(new Person(cityChengDu, 160));
            } else if (i % 7 == 0) {
                // ŦԼ������200
                people.add(new Person(cityNewYork, 200));
            } else if (i % 9 == 0) {
                people.add(new Person(cityNewYork, 185));
            } else if (i % 11 == 0) {
                // ŦԼ��С���165
                people.add(new Person(cityNewYork, 165));
            } else {
                // Ĭ�����ŦԼ��С���165
                people.add(new Person(cityNewYork, 165));
            }
        }
        return people;
    }

    /**
     * ������
     * @param styleName �������
     * @param totalPerson ������
     * @param usedTime �����ʱ
     * @param tallestByCity ͳ�ƺ������ߵĳ��з���MAP
     */
    private static void printResult(String styleName, long totalPerson, long usedTime, Map<City, Optional<Person>> tallestByCity) {
        System.out.println("\n" + styleName + "������ " + totalPerson + " �������ڲ�ͬ���������ߵĽ�����£�����ʱ " + usedTime + " ms��");
        tallestByCity.forEach((city, person) -> {
            person.ifPresent(p -> System.out.println(city.getName() + " -> " + p.getHeight()));
        });
    }

}
