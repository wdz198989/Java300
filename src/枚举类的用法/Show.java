package 枚举类的用法;

//使用enum关键字定义枚举类实现接口
//枚举类和普通类一样，可以实现一个或多个接口。枚举类实现接口分为两种情况：
// 情况一：若枚举类的所有枚举对象在调用实现的接口方法时，呈现相同的行为方式，则只要统一实现该方法即可；
// 此时与普通类实现接口一样，没有任何区别。
public interface Show {
    void show();
}
