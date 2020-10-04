package thirtyDayForJava.StreamAPI;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/9/26 12:01
 * @Description :
 */
/**
 * ����Stream����ֹ����
 *
 * @author shkstart
 * @create 2019 ���� 6:37
 */
public class StreamAPITest2 {
    //1-ƥ�������
    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();

//        allMatch(Predicate p)��������Ƿ�ƥ������Ԫ�ء�
//          ��ϰ���Ƿ����е�Ա�������䶼����18
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

//        anyMatch(Predicate p)��������Ƿ�����ƥ��һ��Ԫ�ء�
//         ��ϰ���Ƿ����Ա���Ĺ��ʴ��� 10000
        boolean anyMatch = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(anyMatch);

//        noneMatch(Predicate p)��������Ƿ�û��ƥ���Ԫ�ء�
//          ��ϰ���Ƿ����Ա���ա��ס�
        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().startsWith("��"));
        System.out.println(noneMatch);
//        findFirst�������ص�һ��Ԫ��
        Optional<Employee> employee = employees.stream().findFirst();
        System.out.println(employee);
//        findAny�������ص�ǰ���е�����Ԫ��
        Optional<Employee> employee1 = employees.parallelStream().findAny();
        System.out.println(employee1);

    }

    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();
        // count������������Ԫ�ص��ܸ���
        long count = employees.stream().filter(e -> e.getSalary() > 5000).filter(e->e.getAge()>30).count();
        System.out.println(count);
//        max(Comparator c)���������������ֵ
//        ��ϰ��������ߵĹ��ʣ�
        Stream<Double> salaryStream = employees.stream().map(e -> e.getSalary());
        Optional<Double> maxSalary = salaryStream.max(Double::compare);
        System.out.println(maxSalary);
//        min(Comparator c)��������������Сֵ
//        ��ϰ��������͹��ʵ�Ա��
        Optional<Employee> employee = employees.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(employee);
        System.out.println();
//        forEach(Consumer c)�����ڲ�����
        employees.stream().forEach(System.out::println);

        //ʹ�ü��ϵı�������
        employees.forEach(System.out::println);
    }

    //2-��Լ
    @Test
    public void test3(){
//        reduce(T identity, BinaryOperator)�������Խ�����Ԫ�ط�������������õ�һ��ֵ������ T
//        ��ϰ1������1-10����Ȼ���ĺ�
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);


//        reduce(BinaryOperator) �������Խ�����Ԫ�ط�������������õ�һ��ֵ������ Optional<T>
//        ��ϰ2�����㹫˾����Ա�����ʵ��ܺ�
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Double> salaryStream = employees.stream().map(Employee::getSalary);
//        Optional<Double> sumMoney = salaryStream.reduce(Double::sum);
        Optional<Double> sumMoney = salaryStream.reduce((d1, d2) -> d1 + d2);
        System.out.println(sumMoney.get());

    }

    //3-�ռ�
    @Test
    public void test4(){
//        collect(Collector c)��������ת��Ϊ������ʽ������һ�� Collector�ӿڵ�ʵ�֣����ڸ�Stream��Ԫ�������ܵķ���
//        ��ϰ1�����ҹ��ʴ���6000��Ա�����������Ϊһ��List��Set

        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> employeeList = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());

        employeeList.forEach(System.out::println);
        System.out.println();
        Set<Employee> employeeSet = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());

        employeeSet.forEach(System.out::println);




    }
}
