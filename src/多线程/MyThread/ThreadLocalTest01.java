package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 22:04
 * @Description : ThreadLocal ÿ���߳�����Ĵ洢���أ��ֲ�����
 * get/set/initialValue
 */
public class ThreadLocalTest01 {
     //TODO  ��ʼ����ֵ
    //private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    /**
     *    ���ĳ�ʼ����ֵһ
     */
   /* private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected  Integer initialValue(){
            return 200;
        };
     };*/


    /**
     *    ���ĳ�ʼ����ֵ��
     */
    private static ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(()->300);

    public static void main(String[] args) {

        /**
         *  ��ȡֵ
         */
        System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());

        /**
         *  ����ֵ
         */
        threadLocal.set(99);

        System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());

        /**
         *  �����½����߳�
         */
        new Thread(new MyRun()).start();
        new Thread(new MyRun()).start();
    }

    public static class MyRun implements Runnable{

        @Override
        public void run() {
            threadLocal.set((int)(Math.random()*99));

            System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());

        }
    }
}
