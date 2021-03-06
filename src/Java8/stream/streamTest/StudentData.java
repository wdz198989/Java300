package Java8.stream.streamTest;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 9:38
 * @Description : 用于获取数据的类
 */
public class StudentData {

    public static List<Student> getStudents(){
        List<Student> list =new ArrayList<>();
        list.add(new Student(1,"刘备",18,90.4));
        list.add(new Student(2,"张飞",19,87.4));
        list.add(new Student(3,"关羽",21,67.4));
        list.add(new Student(4,"赵云",15,89.4));
        list.add(new Student(5,"马超",16,91.4));
        list.add(new Student(6,"曹操",19,83.4));
        list.add(new Student(7,"荀彧",24,78.4));
        list.add(new Student(8,"孙权",26,79.4));
        list.add(new Student(9,"鲁肃",21,93.4));
        list.add(new Student(9,"鲁肃",21,93.4));
        return list;
    }


    public static Student[] getArrStudents(){
        Student[] strings = {new Student(1,"刘备",18,90.4),new Student(2,"张飞",19,87.4)};
         return strings;
    }
}
