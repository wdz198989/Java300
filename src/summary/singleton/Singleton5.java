package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:16
 * @Description : 同步延迟加载 — 使用内部类实现延迟加载
 */
public class Singleton5 {

    /**
     * 如上述代码所示，我们可以使用内部类实现线程安全的懒汉式单例，
     * 这种方式也是一种效率比较高的做法。至于其为什么是线程安全的，
     * 其与问题 “为什么说饿汉式单例天生就是线程安全的？” 相类似，此不赘述。
     */

    // 私有内部类，按需加载，用时加载，也就是延迟加载
    private static class Holder {
        private static Singleton5 singleton5 = new Singleton5();
    }

    private Singleton5() {

    }

    public static Singleton5 getSingleton5() {
        return Holder.singleton5;
    }
}
