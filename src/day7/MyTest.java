package day7;


/**
 * @Author : WuDazhong
 * @Date :2019/7/7 13:32
 * @Description : 数据类型转换
 */
public class MyTest {
    public static void main(String[] args) {
        Integer a = new Integer(30);
        System.out.println(a);
        Integer b = Integer.valueOf(30);
        System.out.println(b);
        int c = a.intValue();
        double d = b.doubleValue();
        System.out.println(c);
        System.out.println(d);
        Integer e = new Integer("99");
        System.out.println(e);
        Integer f = Integer.parseInt("99");
        System.out.println(f);
        String s = f.toString();
        String s2= ""+f;
        System.out.println(s);
        System.out.println(s2.getClass());
    }
}
