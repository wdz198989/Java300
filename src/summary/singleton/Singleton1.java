package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 0:52
 * @Description : 饿汉式单例
 * 三要素：
 *私有的构造方法；
 *指向自己实例的私有静态引用；
 *以自己实例为返回值的静态的公有方法。
 * 种是 饿汉式单例(立即加载)，一种是 懒汉式单例(延迟加载)。
 * 饿汉式单例在单例类被加载时候，就实例化一个对象并交给自己的引用；
 * 而懒汉式单例只有在真正使用的时候才会实例化一个对象并交给自己的引用。
 */
public class Singleton1 {

    /**
     *  指向自己实例的私有静态引用，主动创建
     */

    private static Singleton1 singleton1 = new Singleton1();

    /**
     *    私有的构造方法
     */

    private Singleton1(){}

    /**
     *  以自己实例为返回值的静态的公有方法，静态工厂方法
      */
    public static Singleton1 getSingleton1(){
        return singleton1;
    }

    /**
     *   我们知道，类加载的方式是按需加载，且加载一次。。因此，在上述单例类被加载时，
     *   就会实例化一个对象并交给自己的引用，供系统使用；而且，由于这个类在整个生命周期中只会被加载一次，
     *   因此只会创建一个实例，即能够充分保证单例。
     */
}
