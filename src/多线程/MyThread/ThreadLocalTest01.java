package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 22:04
 * @Description : ThreadLocal 每个线程自身的存储本地，局部区域
 * get/set/initialValue
 */
public class ThreadLocalTest01 {
     //TODO  初始化的值
    //private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    /**
     *    更改初始化的值一
     */
   /* private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected  Integer initialValue(){
            return 200;
        };
     };*/


    /**
     *    更改初始化的值二
     */
    private static ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(()->300);

    public static void main(String[] args) {

        /**
         *  获取值
         */
        System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());

        /**
         *  设置值
         */
        threadLocal.set(99);

        System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());

        /**
         *  启动新建的线程
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
