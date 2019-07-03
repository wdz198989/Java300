package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 14:46
 * @Description : 测试类型转换常见问题
 */
public class TestTypeConvertError {
    public static void main(String[] args) {
        int money = 1000000000;
        int year = 20;
        int total = money*year;
        System.out.println(total);
        long total1= money*year;
        System.out.println(total1);
        long total2=money*((long)year);
        System.out.println(total2);
    }
}
