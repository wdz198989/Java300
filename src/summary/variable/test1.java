package summary.variable;


/**
 * @Author : WuDazhong
 * @Date :2019/7/15 21:20
 * @Description : 测试== 和equals的区别
 */
public class test1 {
    public static void main(String[] args) {
        String a = new String("ab");
        // a 为一个引用
       String b = new String("ab");
        // b为另一个引用,对象的内容一样
        String aa = "ab";
        // 放在常量池中
        String bb = "ab";
        // 从常量池中查找

        // true
            System.out.println(aa==bb);


            // false，非同一对象
            System.out.println(a==b);


            System.out.println(a.equals(b));

            System.out.println(42==42.0);

    }
}