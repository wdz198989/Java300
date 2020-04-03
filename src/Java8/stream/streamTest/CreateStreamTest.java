package Java8.stream.streamTest;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 9:47
 * @Description : 测试类：创建流，使用流，终止流
 */
public class CreateStreamTest {

    // 方式一：通过一个集合创建流
    @org.junit.Test
    public void test1(){
        List<Student> studentList = StudentData.getStudents();
        System.out.println(studentList.size());
        // 返回一个顺序流
        Stream<Student> stream1 = studentList.stream();
        // 返回一个并行流
        Stream<Student> stream2 = studentList.parallelStream();

    }

    // 方式二：通过一个数组创建流
    @org.junit.Test
    public void test2(){
        int[] arr = {1, 2, 34, 4, 65, 7, 87};
        IntStream stream = Arrays.stream(arr);
        Student[] students = StudentData.getArrStudents();
        Stream<Student> stream1 = Arrays.stream(students);
        System.out.println(stream1.count());
        }

    // 方式三：通过Stream.of
    @org.junit.Test
    public void test3(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 8);
        Stream<String> stringStream = Stream.of("1", "2", "4", "5", "6", "7");
        Stream<Student> studentStream = Stream.of(
                new Student(1, "刘备", 18, 90.4),
                new Student(2, "张飞", 19, 87.4),
                new Student(3, "关羽", 21, 67.4));

        System.out.println(studentStream.count());


    }
    // 方式四：创建一个无限流
    @org.junit.Test
    public void test4(){
     // 每隔5个数取一个，从0开始，无限循环
       // Stream.iterate(0,t->t+5).forEach(System.out::println);
      // 每隔5个数取一个，从0开始，只取前5个
        Stream.iterate(0,t->t+5).limit(5).forEach(System.out::println);
        // 取出一个随机数
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

    }
}
