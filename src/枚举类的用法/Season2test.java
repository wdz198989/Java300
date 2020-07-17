package 枚举类的用法;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 21:57
 * @Description : 在JDK 1.5 中新增了enum关键字用于定义枚举类，但是在使用时需要注意以下几点：
 * (1)使用 enum 定义的枚举类默认继承了 java.lang.Enum类，因此不能再继承其他类；
 * (2)使用 enum 定义的枚举类默认使用final进行修饰，不可以被继承；(也从侧面说明了它是一个常量类)
 * (3)枚举类的构造器只能使用 private 权限修饰符；
 * (4)枚举类的所有实例必须在枚举类中显式列出，多个对象之间使用",“隔开，末尾使用”;"结束。
 * 列出的实例系统会自动添加 public static final 进行修饰；
 * (5)必须在枚举类的第一行声明枚举类对象；
 * (6)若枚举类只有一个枚举对象, 则可以作为一种单例模式的实现方式。
 * 下面还是使用季节举例，来自定义一个枚举类。
 */
public class Season2test {
     public static void main(String[] args) {
        Season2 spring = Season2.SPRING;
        System.out.println(spring);//SPRING


         //使用方法如下：
         Season2[] seasons = Season2.values();
         for (int i = 0; i < seasons.length; i++) {
             System.out.println(seasons[i]);
         }
        // valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。
         //如不是，会报运行时异常：IllegalArgumentException；
//使用方法如下：
         Season2 spring2 = Season2.valueOf("SPRING");
         System.out.println(spring2);//SPRING
         //toString()：返回当前枚举类对象的名称
//使用方法如下：
         Season2 spring3 = Season2.SPRING;
         System.out.println(spring3.toString());//SPRING
    }
}
