package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:05
 * @Description : 　开启多个线程来分别获取单例，然后打印它们所获取到的单例的hashCode值。
 * 若它们获取的单例是相同的(该单例模式的实现是线程安全的)，那么它们的hashCode值一定完全一致；
 * 若它们的hashCode值不完全一致，那么获取的单例必定不是同一个，
 * 即该单例模式的实现不是线程安全的，是多例的。
 */
public class Test {
    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TestThread();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }

}

class TestThread extends Thread {
    @Override
    public void run() {
        // 对于不同单例模式的实现，只需更改相应的单例类名及其公有静态工厂方法名即可
        int hash = Singleton3.getSingleton3().hashCode();
        System.out.println(hash);
    }
}
