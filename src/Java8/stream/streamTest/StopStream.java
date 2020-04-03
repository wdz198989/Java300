package Java8.stream.streamTest;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 20:10
 * @Description : 终止流
 */
public class StopStream {

    //  匹配和查找
    @Test
    public void test1(){
        List<Student> list = StudentData.getStudents();
        //判断是否所有的学生的年龄都大于20岁
        boolean allMatch = list.stream().allMatch(item -> item.getAge() > 20);
        System.out.println(allMatch);

        // 判断是否有的学生年龄都是大于20岁
        boolean anyMatch = list.stream().anyMatch(item -> item.getAge() > 20);
        System.out.println(anyMatch);

        // 判断是否存在学生叫曹操
        boolean noneMatch = list.stream().noneMatch(item -> item.getName().equals("曹操"));
        System.out.println(noneMatch);

        // 查找所有学生的数量
        long count = list.stream().count();
        long count1 = list.stream().filter(item -> item.getScore() > 90.0).count();

        // 查找第一个学生
        Optional<Student> first = list.stream().findFirst();
        System.out.println(first);

        // 查找当前流中的元素
        Optional<Student> any = list.stream().findAny();
        System.out.println(any);

    }

    // 规约
    @Test
    public void test2(){
        //计算数的总和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().reduce( 0,Integer::sum));
        System.out.println(list.stream().reduce( Integer::sum));
        //计算学生总分
        List<Student> studentList = StudentData.getStudents();
        Stream<Double> doubleStream = studentList.stream().map(Student::getScore);
       // System.out.println(doubleStream.reduce(Double::sum));
        System.out.println(doubleStream.reduce(0.0,Double::sum));
    }

    //收集
    @Test
    public void test3(){
        List<Student> studentList = StudentData.getStudents();
        List<Student> listStream = studentList.stream().filter(e -> e.getAge() > 18).collect(Collectors.toList());
        System.out.println(listStream);
        Set<Student> setStream = studentList.stream().filter(e -> e.getAge() > 18).collect(Collectors.toSet());
        System.out.println(setStream);
    }
}
