package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 22:37
 * @Description :  InheritableThreadLocal  继承上下文环境数据，拷贝一份给子线程
 */
public class ThreadLocalTest04 {
    private static ThreadLocal<Integer> threadLocal =new ThreadLocal<>();
    private static ThreadLocal<Integer> threadLocalNew =new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set(99);
        System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());
        }).start();

        threadLocalNew.set(99);
        System.out.println(Thread.currentThread().getName()+"-->"+threadLocalNew.get());
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"-->"+threadLocalNew.get());
        }).start();
    }
}
