package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 22:31
 * @Description : 分析上下文环境
 */
public class ThreadLocalTest03 {

    private static ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(()->5);

    public static void main(String[] args) {
        new Thread(new MyRun()).start();

        new Thread(new MyRun()).start();


    }

    public static class MyRun implements Runnable{
        public MyRun() {
            threadLocal.set(99);
            System.out.println(Thread.currentThread().getName()+"--》"+threadLocal.get());
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"--》"+threadLocal.get());
        }
    }
}
