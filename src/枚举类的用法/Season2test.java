package 枚举类的用法;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 21:57
 * @Description : 11
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
