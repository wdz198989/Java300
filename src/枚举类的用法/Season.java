package 枚举类的用法;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 21:49
 * @Description :
 * 枚举类型是Java 5中新增的特性，它是一种特殊的数据类型，之所以特殊是因为它既是一种类(class)类型却又比类类型多了些特殊的约束，
 * 但是这些约束的存在也造就了枚举类型的简洁性、安全性以及便捷性。当需要定义一组常量时，强烈建议使用枚举类。
 * 使用枚举类的条件：类的对象是有限个，确定的。例如星期类，它的对象只有星期一…星期日七个，
 * 而且是确定的，此时就可以把星期类定义为一个枚举类；又例如性别类，它的对象只有男和女两个，
 * 而且是确定的，此时同样可以把性别类定义为一个枚举类；还有诸如季节等这种类的对象是有限个，确定的都可以定义为一个枚举类。
 * 1、枚举类的实现
 * 在JDK1.5之前，还没有枚举类型，如果想要使用枚举类需要我们去自定义。在自定义枚举类时需要注意以下几点：
 * (1)枚举类对象的属性不应允许被改动，所以应该使用 private final 进行修饰；
 * (2)枚举类使用 private final 修饰的属性应该在构造器中为其赋值；
 * (3)枚举类的构造器要私有化，保证不能在类的外部创建其对象，否则就不能确定对象的个数；
 * (4)在枚举类内部创建的枚举类的实例(枚举)对象，要声明为：public static final。
 * 下面就拿季节举例，来自定义一个枚举类。
 */
public class Season {
    //1.声明Season对象的属性，又因为枚举类对象的属性不应允许被改动, 所以应该使用 private final修饰
    //枚举类的使用 private final 修饰的属性应该在构造器中为其赋值
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化构造器，保证不能在类的外部创建其对象，否则就不能确定对象的个数
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //3.提供当前枚举类的多个枚举对象，又因为枚举类是不可变的常量类，所以需要声明为：public static final
    public static final Season SPRING=new Season("春天","鸟语花香");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINNER=new Season("冬天","寒风瑟瑟");

    //其他需求1：获取枚举类对象的属性
    //只需要提供属性的get方法即可，但是不能提供set方法，因为枚举类是不可变的常量类，不能被修改
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //其他需求2:打印对象，提供toString方法即可
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}



