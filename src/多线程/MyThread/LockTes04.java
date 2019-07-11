package ∂‡œﬂ≥Ã.MyThread;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author : WuDazhong
 * @Date :2019/7/11 23:58
 * @Description : JUC
 */
public class LockTes04 {
    ReentrantLock lock = new ReentrantLock();
    public  void a () throws InterruptedException {
        lock.lock();
        System.out.println(lock.getHoldCount());
        doSomething();
        lock.unlock();
        System.out.println(lock.getHoldCount());
    }
    public  void doSomething () throws InterruptedException {
        lock.lock();
        System.out.println(lock.getHoldCount());
        lock.unlock();
        System.out.println(lock.getHoldCount());

    }
    public static void main(String[] args) throws InterruptedException {

        LockTes04 test = new LockTes04();
        test.a();
        Thread.sleep(1000);
        System.out.println(test.lock.getHoldCount());


    }
}
