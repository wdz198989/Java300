package day2;


import java.util.Scanner;

/**
 * @Author : WuDazhong
 * @Date :2019/7/2 14:55
 * @Description : 键盘输入
 */
public class TestScnner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        System.out.println("请输入爱好：");
        String favor=scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(favor);
        System.out.println(age);


    }
}
