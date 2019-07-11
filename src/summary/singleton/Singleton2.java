package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 0:57
 * @Description : 懒汉式单例：我们从懒汉式单例可以看到，单例实例被延迟加载，
 *                即只有在真正使用的时候才会实例化一个对象并交给自己的引用
 */
public class Singleton2 {

    // 指向自己实例的私有静态引用
    private static Singleton2 singleton2;

    // 私有的构造方法
    private Singleton2(){}
    //TODO  原始
    // 以自己实例为返回值的静态的公有方法，静态工厂方法
   /* public static Singleton2 getSingleton2(){
        // 被动创建，在真正需要使用时才去创建
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }*/
    //TODO  同步延迟加载 — synchronized方法

    /**
     * 　　该实现与上面传统懒汉式单例的实现唯一的差别就在于：
     * 是否使用 synchronized 修饰 getSingleton2()方法。若使用，就保证了对临界资源的同步互斥访问，
     * 也就保证了单例。
     *
     * 　　从执行结果上来看，问题已经解决了，但是这种实现方式的运行效率会很低，
     * 因为同步块的作用域有点大，而且锁的粒度有点粗。同步方法效率低，那我们考虑使用同步代码块来实现。
     * @return
     */
    // 使用 synchronized 修饰，临界资源的同步互斥访问
    /*public static synchronized Singleton2 getSingleton2(){
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }*/


    //TODO  同步延迟加载 — synchronized块
    public static Singleton2 getSingleton2(){
        // 使用 synchronized 块，临界资源的同步互斥访问
        synchronized(Singleton2.class){
            if (singleton2 == null) {
                singleton2 = new Singleton2();
            }
        }
        return singleton2;
    }






    /**
     * 　　总之，从速度和反应时间角度来讲，饿汉式（又称立即加载）要好一些；
     *    从资源利用效率上说，懒汉式（又称延迟加载）要好一些。
     */

     /*    3、单例模式的优点

　　我们从单例模式的定义和实现，可以知道单例模式具有以下几个优点：

    在内存中只有一个对象，节省内存空间；

    避免频繁的创建销毁对象，可以提高性能；

    避免对共享资源的多重占用，简化访问；

    为整个系统提供一个全局访问点。*/

}
