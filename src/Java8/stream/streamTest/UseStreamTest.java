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
 * @Description : ʹ��Stream��������
 */
public class UseStreamTest {

    // ɸѡ����Ƭ
    @Test
    public  void test1(){
        List<Student> list = StudentData.getStudents();
        //��1�����ˣ� ���˳������������20���ͬѧ
        list.stream().filter(item->item.getAge()>20).forEach(System.out::println);
        System.out.println("===============================================================");
        // (2) �ض����� ɸѡ��ǰ��������
        list.stream().limit(3).forEach(System.out::println);
        List<Student> collect = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("===============================================================");
        //(3)����Ԫ�أ�����ǰ5��Ԫ��
        list.stream().skip(5).forEach(System.out::println);
        System.out.println("===============================================================");
        //(4) �����ظ�����(�������ظ�����)
        list.stream().distinct().forEach(System.out::println);
           // ������������ظ�������
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        System.out.println(list1.stream().count());
        list1.stream().distinct().forEach(System.out::println);

    }

    //ӳ��
    @Test
    public void test2(){
        //map����
        List<String> list = Arrays.asList("java", "python", "go");
        Stream<String> stream = list.stream();
        //��ÿ��Сд��ĸ��ɴ�д��ĸ
        stream.map(str->str.toUpperCase()).forEach(System.out::println);
        //ɸѡ�����е����䣬�ڹ��˳����д���20���
        List<Student> students = StudentData.getStudents();
        Stream<Student> stream1 = students.stream();
        List<Integer> collect = stream1.map(Student::getAge).filter(age->age>20).collect(Collectors.toList());
        System.out.println("���д���20���Ϊ��"+collect.size());
        Stream<Student> stream2 = students.stream();
        Stream<Integer> ageStream = stream2.map(Student::getAge);
        ageStream.filter(age->age>20).forEach(System.out::println);

        }

    // ����
    @Test
    public void test3(){
        //��Ȼ����
        List<Integer> list = Arrays.asList(4, 3, 7, 9, 12, 8, 10, 23, 2);
        Stream<Integer> stream = list.stream();
        stream.sorted().forEach(System.out::println);
        System.out.println("=====================================================");
        //(2) �������򣺶��������ʵ��comparable�ӿڻ���ֱ��ָ��
         // TODO ��һ�֣���ʵ��comparable�ӿ�,������
        // �ڶ��֣�ֱ��ָ��comparable
        List<Student> studentList2 = StudentData.getStudents();
        studentList2.stream().sorted((e1,e2)->Integer.compare(e1.getAge(),e2.getAge())).forEach(System.out::println);

    }
}