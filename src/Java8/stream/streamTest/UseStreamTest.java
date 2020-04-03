package Java8.stream.streamTest;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 13:19
 * @Description : 使用Stream操作数据
 */
public class UseStreamTest {

    // 筛选和切片
    @Test
    public  void test1(){
        List<Student> list = StudentData.getStudents();
        //（1）过滤： 过滤出所有年龄大于20岁的同学
        list.stream().filter(item->item.getAge()>20).forEach(System.out::println);
        System.out.println("===============================================================");
        // (2) 截断流： 筛选出前三条数据
        list.stream().limit(3).forEach(System.out::println);
        List<Student> collect = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("===============================================================");
        //(3)跳过元素：跳过前5个元素
        list.stream().skip(5).forEach(System.out::println);
        System.out.println("===============================================================");
        //(4) 过滤重复数据(对象不算重复数据)
        list.stream().distinct().forEach(System.out::println);
           // 此种情况才算重复的数据
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        System.out.println(list1.stream().count());
        list1.stream().distinct().forEach(System.out::println);

    }

    //映射
    @Test
    public void test2(){
        //map操作
        List<String> list = Arrays.asList("java", "python", "go");
        Stream<String> stream = list.stream();
        //将每个小写字母变成大写字母
        stream.map(str->str.toUpperCase()).forEach(System.out::println);
        //筛选出所有的年龄，在过滤出所有大于20岁的
        List<Student> students = StudentData.getStudents();
        Stream<Student> stream1 = students.stream();
        List<Integer> collect = stream1.map(Student::getAge).filter(age->age>20).collect(Collectors.toList());
        System.out.println("所有大于20岁的为："+collect.size());
        Stream<Student> stream2 = students.stream();
        Stream<Integer> ageStream = stream2.map(Student::getAge);
        ageStream.filter(age->age>20).forEach(System.out::println);

        }

    // 排序
    @Test
    public void test3(){
        //自然排序
        List<Integer> list = Arrays.asList(4, 3, 7, 9, 12, 8, 10, 23, 2);
        Stream<Integer> stream = list.stream();
        stream.sorted().forEach(System.out::println);
        System.out.println("=====================================================");
        //(2) 对象排序：对象类可以实现comparable接口或者直接指定
         // TODO 第一种：先实现comparable接口,待完善
        // 第二种：直接指定comparable
        List<Student> studentList2 = StudentData.getStudents();
        studentList2.stream().sorted((e1,e2)->Integer.compare(e1.getAge(),e2.getAge())).forEach(System.out::println);

    }
}