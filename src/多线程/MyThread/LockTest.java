package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 23:28
 * @Description : 可重入锁
 */
public class LockTest {
    public  void test(){
        //TODO 第一次获取锁
        synchronized (this){
            while (true){
                //TODO 第2次获取 同样的锁
                synchronized (this){
                    System.out.println("ReentrantLock!");
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }

    }

    public static void main(String[] args) {
        new LockTest().test();
    }
}
