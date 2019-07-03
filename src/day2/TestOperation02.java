package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 12:06
 * @Description : 测试关系运算符
 */
public class TestOperation02 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'c';
        System.out.println(a<b);
        System.out.println((int)a);
        System.out.println(0+a);

        //TODO 位运算符
        System.out.println(3&4);
        System.out.println(3|4);
        System.out.println(3^4);
        System.out.println(~3);
        System.out.println(3<<2);
        System.out.println(12>>2);
    }
}
