package summary.test;


/**
 * @Author : WuDazhong
 * @Date :2019/7/15 11:24
 * @Description : 测试成员变量和局部变量的区别
 */
public class TestChengYuan {


    /*1. 从语法形式上看:成员变量是属于类的，而局部变量是在方法中定义的变量或是方法的参数；
          成员变量可以被 public,private,static 等修饰符所修饰，而局部变量不能被访问控制修饰符及 static 所修饰；
         但是，成员变量和局部变量都能被 final 所修饰。
      2.  从变量在内存中的存储方式来看:如果成员变量是使用static修饰的，那么这个成员变量是属于类的，
         如果没有使用static修饰，这个成员变量是属于实例的。而对象存在于堆内存，局部变量则存在于栈内存。
      3.  从变量在内存中的生存时间上看:成员变量是对象的一部分，它随着对象的创建而存在，
          而局部变量随着方法的调用而自动消失。
      4. 成员变量如果没有被赋初值:则会自动以类型的默认值而赋值（一种情况例外:被 final 修饰的成员变量
          也必须显式地赋值），而局部变量则不会自动赋值。
*/

    public static String name;
    private String uName;
    private int age;
    private boolean isMan;
    public static final int scoreEnglish=10;
    public  final int scoreMath=100;

    public static void main(String[] args) {
        //static String name;
        final String uName;
        //System.out.println(uName);
        System.out.println(name);
        TestChengYuan tt = new TestChengYuan();
        System.out.println(tt.age);
        System.out.println(tt.uName);
        System.out.println(tt.isMan);
    }
}
