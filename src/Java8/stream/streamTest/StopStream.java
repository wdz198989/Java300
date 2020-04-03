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
 * @Description : ��ֹ��
 */
public class StopStream {

    //  ƥ��Ͳ���
    @Test
    public void test1(){
        List<Student> list = StudentData.getStudents();
        //�ж��Ƿ����е�ѧ�������䶼����20��
        boolean allMatch = list.stream().allMatch(item -> item.getAge() > 20);
        System.out.println(allMatch);

        // �ж��Ƿ��е�ѧ�����䶼�Ǵ���20��
        boolean anyMatch = list.stream().anyMatch(item -> item.getAge() > 20);
        System.out.println(anyMatch);

        // �ж��Ƿ����ѧ���вܲ�
        boolean noneMatch = list.stream().noneMatch(item -> item.getName().equals("�ܲ�"));
        System.out.println(noneMatch);

        // ��������ѧ��������
        long count = list.stream().count();
        long count1 = list.stream().filter(item -> item.getScore() > 90.0).count();

        // ���ҵ�һ��ѧ��
        Optional<Student> first = list.stream().findFirst();
        System.out.println(first);

        // ���ҵ�ǰ���е�Ԫ��
        Optional<Student> any = list.stream().findAny();
        System.out.println(any);

    }

    // ��Լ
    @Test
    public void test2(){
        //���������ܺ�
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().reduce( 0,Integer::sum));
        System.out.println(list.stream().reduce( Integer::sum));
        //����ѧ���ܷ�
        List<Student> studentList = StudentData.getStudents();
        Stream<Double> doubleStream = studentList.stream().map(Student::getScore);
       // System.out.println(doubleStream.reduce(Double::sum));
        System.out.println(doubleStream.reduce(0.0,Double::sum));
    }

    //�ռ�
    @Test
    public void test3(){
        List<Student> studentList = StudentData.getStudents();
        List<Student> listStream = studentList.stream().filter(e -> e.getAge() > 18).collect(Collectors.toList());
        System.out.println(listStream);
        Set<Student> setStream = studentList.stream().filter(e -> e.getAge() > 18).collect(Collectors.toSet());
        System.out.println(setStream);
    }
}
