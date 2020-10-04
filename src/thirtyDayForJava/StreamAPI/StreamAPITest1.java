package thirtyDayForJava.StreamAPI;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/9/26 11:52
 * @Description :
 */
/**
 * ����Stream���м����
 *
 * @author shkstart
 * @create 2019 ���� 4:42
 */
public class StreamAPITest1 {
    //1-ɸѡ����Ƭ
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
//        filter(Predicate p)�������� Lambda �� �������ų�ĳЩԪ�ء�
        Stream<Employee> stream = list.stream();
        //��ϰ����ѯԱ������н�ʴ���7000��Ա����Ϣ
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);


        List<Employee> list1 = list.stream().filter(e -> e.getSalary() > 7000).collect(Collectors.toList());
        System.out.println("=============="+list1.size());


        //        limit(n)�����ض�����ʹ��Ԫ�ز���������������
        list.stream().limit(3).forEach(System.out::println);
        System.out.println();

//        skip(n) ���� ����Ԫ�أ�����һ���ӵ���ǰ n ��Ԫ�ص�����������Ԫ�ز��� n �����򷵻�һ���������� limit(n) ����
        list.stream().skip(3).forEach(System.out::println);

        System.out.println();
//        distinct()����ɸѡ��ͨ����������Ԫ�ص� hashCode() �� equals() ȥ���ظ�Ԫ��

        list.add(new Employee(1010,"��ǿ��",40,8000));
        list.add(new Employee(1010,"��ǿ��",41,8000));
        list.add(new Employee(1010,"��ǿ��",40,8000));
        list.add(new Employee(1010,"��ǿ��",40,8000));
        list.add(new Employee(1010,"��ǿ��",40,8000));

//        System.out.println(list);

        list.stream().distinct().forEach(System.out::println);
    }

    //ӳ��
    @Test
    public void test2(){
//        map(Function f)��������һ��������Ϊ��������Ԫ��ת����������ʽ����ȡ��Ϣ���ú����ᱻӦ�õ�ÿ��Ԫ���ϣ�������ӳ���һ���µ�Ԫ�ء�
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

//        ��ϰ1����ȡԱ���������ȴ���3��Ա����������
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> namesStream = employees.stream().map(Employee::getName);
        namesStream.filter(name -> name.length() > 3).forEach(System.out::println);
        System.out.println();
        //��ϰ2��
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringToStream);
        streamStream.forEach(s ->{
            s.forEach(System.out::println);
        });
        System.out.println();
//        flatMap(Function f)��������һ��������Ϊ�����������е�ÿ��ֵ��������һ������Ȼ������������ӳ�һ������
        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest1::fromStringToStream);
        characterStream.forEach(System.out::println);

    }

    //���ַ����еĶ���ַ����ɵļ���ת��Ϊ��Ӧ��Stream��ʵ��
    public static Stream<Character> fromStringToStream(String str){//aa
        ArrayList<Character> list = new ArrayList<>();
        for(Character c : str.toCharArray()){
            list.add(c);
        }
        return list.stream();

    }



    @Test
    public void test3(){
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

//        list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);

    }

    //3-����
    @Test
    public void test4(){
//        sorted()������Ȼ����
        List<Integer> list = Arrays.asList(12, 43, 65, 34, 87, 0, -98, 7);
        list.stream().sorted().forEach(System.out::println);
        //���쳣��ԭ��:Employeeû��ʵ��Comparable�ӿ�
//        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().sorted().forEach(System.out::println);


//        sorted(Comparator com)������������

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted( (e1,e2) -> {
             //�Ȱ��������С�����������������ͬ�����չ��ʴӸߵ�������-Double��ǰ�����һ�����ţ�
            int ageValue = Integer.compare(e1.getAge(),e2.getAge());
            if(ageValue != 0){
                return ageValue;
            }else{
                return -Double.compare(e1.getSalary(),e2.getSalary());
            }

        }).forEach(System.out::println);
    }
}
