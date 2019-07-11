package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:29
 * @Description : 单例模式 与 ThreadLocal
 * 　借助于 ThreadLocal，我们可以实现双重检查模式的变体。
 * 我们将临界资源线程局部化，具体到本例就是将双重检测的第一层检测条件 if (instance == null)
 * 转换为 线程局部范围内的操作 。这里的 ThreadLocal 也只是用作标识而已，用来标识每个线程是否已访问过：
 * 如果访问过，则不再需要走同步块，这样就提高了一定的效率。
 */
public class Singleton4 {

    // ThreadLocal 线程局部变量
    private static ThreadLocal<Singleton4> threadLocal = new ThreadLocal<Singleton4>();
    // 不需要是
    private static Singleton4 singleton4 = null;

    private Singleton4(){}

    public static Singleton4 getSingleton4(){
        // 第一次检查：该线程是否第一次访问
        if (threadLocal.get() == null) {
            createSingleton4();
        }
        return singleton4;
    }

    public static void createSingleton4(){
        synchronized (Singleton4.class) {
            // 第二次检查：该单例是否被创建
            if (singleton4 == null) {
                // 只执行一次
                singleton4 = new Singleton4();
            }
        }
        // 将单例放入当前线程的局部变量中
        threadLocal.set(singleton4);
    }
}
