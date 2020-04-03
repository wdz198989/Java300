package Java8.stream.streamTest;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 9:47
 * @Description : �����ࣺ��������ʹ��������ֹ��
 */
public class CreateStreamTest {

    // ��ʽһ��ͨ��һ�����ϴ�����
    @org.junit.Test
    public void test1(){
        List<Student> studentList = StudentData.getStudents();
        System.out.println(studentList.size());
        // ����һ��˳����
        Stream<Student> stream1 = studentList.stream();
        // ����һ��������
        Stream<Student> stream2 = studentList.parallelStream();

    }

    // ��ʽ����ͨ��һ�����鴴����
    @org.junit.Test
    public void test2(){
        int[] arr = {1, 2, 34, 4, 65, 7, 87};
        IntStream stream = Arrays.stream(arr);
        Student[] students = StudentData.getArrStudents();
        Stream<Student> stream1 = Arrays.stream(students);
        System.out.println(stream1.count());
        }

    // ��ʽ����ͨ��Stream.of
    @org.junit.Test
    public void test3(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 8);
        Stream<String> stringStream = Stream.of("1", "2", "4", "5", "6", "7");
        Stream<Student> studentStream = Stream.of(
                new Student(1, "����", 18, 90.4),
                new Student(2, "�ŷ�", 19, 87.4),
                new Student(3, "����", 21, 67.4));

        System.out.println(studentStream.count());


    }
    // ��ʽ�ģ�����һ��������
    @org.junit.Test
    public void test4(){
     // ÿ��5����ȡһ������0��ʼ������ѭ��
       // Stream.iterate(0,t->t+5).forEach(System.out::println);
      // ÿ��5����ȡһ������0��ʼ��ֻȡǰ5��
        Stream.iterate(0,t->t+5).limit(5).forEach(System.out::println);
        // ȡ��һ�������
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

    }
}
