package thirtyDayForJava.StreamAPI;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1. Stream��ע���Ƕ����ݵ����㣬��CPU�򽻵�
 *    ���Ϲ�ע�������ݵĴ洢�����ڴ�򽻵�
 *
 * 2.
 * ��Stream �Լ�����洢Ԫ�ء�
 * ��Stream ����ı�Դ�����෴�����ǻ᷵��һ�����н������Stream��
 * ��Stream �������ӳ�ִ�еġ�����ζ�����ǻ�ȵ���Ҫ�����ʱ���ִ��
 *
 * 3.Stream ִ������
 * �� Stream��ʵ����
 * �� һϵ�е��м���������ˡ�ӳ�䡢...)
 * �� ��ֹ����
 *
 * 4.˵����
 * 4.1 һ���м��������������Դ�����ݽ��д���
 * 4.2 һ��ִ����ֹ��������ִ���м�������������������֮�󣬲����ٱ�ʹ��
 *
 *
 *  ����Stream��ʵ����
 *
 * @author shkstart
 * @create 2019 ���� 4:25
 */
/**
 * @Author : WuDazhong
 * @Date :2020/9/26 11:50
 * @Description :
 */
public class StreamAPITest {
    //���� Stream��ʽһ��ͨ������
    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();

//        default Stream<E> stream() : ����һ��˳����
        Stream<Employee> stream = employees.stream();

//        default Stream<E> parallelStream() : ����һ��������
        Stream<Employee> parallelStream = employees.parallelStream();

    }

    //���� Stream��ʽ����ͨ������
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        //����Arrays���static <T> Stream<T> stream(T[] array): ����һ����
        IntStream stream = Arrays.stream(arr);

        Employee e1 = new Employee(1001,"Tom");
        Employee e2 = new Employee(1002,"Jerry");
        Employee[] arr1 = new Employee[]{e1,e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);

    }
    //���� Stream��ʽ����ͨ��Stream��of()
    @Test
    public void test3(){

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

    }

    //���� Stream��ʽ�ģ�����������
    @Test
    public void test4(){

//      ����
//      public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
        //����ǰ10��ż��
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);


//      ����
//      public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

    }
}
