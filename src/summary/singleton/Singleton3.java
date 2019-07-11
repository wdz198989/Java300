package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:20
 * @Description : 单例模式与双重检查(Double-Check idiom):
 * 使用双重检测同步延迟加载去创建单例的做法是一个非常优秀的做法，
 * 其不但保证了单例，而且切实提高了程序运行效率。
 */
public class Singleton3 {

    //使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
    private static volatile Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getSingleton3() {
        // Double-Check idiom
        if (singleton3 == null) {
            synchronized (Singleton3.class) {       // 1
                // 只需在第一次创建实例时才同步
                if (singleton3 == null) {       // 2
                    singleton3 = new Singleton3();      // 3
                }
            }
        }
        return singleton3;
    }



/*　如上述代码所示，为了在保证单例的前提下提高运行效率，我们需要对 singleton3
    进行第二次检查，目的是避开过多的同步（因为这里的同步只需在第一次创建实例时才同步，
    一旦创建成功，以后获取实例时就不需要同步获取锁了）。这种做法无疑是优秀的，但是我们必须注意一点：
            　　
            　　必须使用volatile关键字修饰单例引用。*/
}
