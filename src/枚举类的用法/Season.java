package 枚举类的用法;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 21:49
 * @Description : 枚举
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



