package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 22:22
 * @Description : ÿ���߳���������ݵĸ��ģ�����Ӱ�������߳�
 */
public class ThreadLocalTest02 {
    private static ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(()->5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyRun()).start();
        }

    }

    public static class MyRun implements Runnable{

        @Override
        public void run() {
            Integer left = threadLocal.get();
            System.out.println(Thread.currentThread().getName()+"�õ��ˣ�"+left);
            threadLocal.set(left-1);
            System.out.println(Thread.currentThread().getName()+"��ʣ�£�"+threadLocal.get());


        }
    }
}
