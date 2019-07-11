package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 23:47
 * @Description : 可重入锁
 */
public class LockTes03 {

    ReLock lock= new ReLock();
    public  void a () throws InterruptedException {
        lock.lock();
        System.out.println(lock.getHoldCount());
        doSomething();
        lock.unLock();
        System.out.println(lock.getHoldCount());
    }
    public  void doSomething () throws InterruptedException {
        lock.lock();
        System.out.println(lock.getHoldCount());
        lock.unLock();
        System.out.println(lock.getHoldCount());

    }
    public static void main(String[] args) throws InterruptedException {

        LockTes03 test = new LockTes03();
        test.a();
        Thread.sleep(1000);
        System.out.println(test.lock.getHoldCount());


    }
}
//可重入锁
class ReLock{
    // 是否占用
    private  boolean  isLocked = false;
    private  Thread lockedBy = null ;
    private int holdCount = 0;

    public int getHoldCount() {
        return holdCount;
    }

    public void setHoldCount(int holdCount) {
        this.holdCount = holdCount;
    }

    //使用锁
    public synchronized   void lock() throws InterruptedException {
        Thread t = Thread.currentThread();
        while (isLocked&&lockedBy!= t){
            wait();
        }

        isLocked=true;
        lockedBy=t;
        holdCount++;
    }
    //释放锁
    public  synchronized void unLock(){
        if(Thread.currentThread()==lockedBy){
            holdCount--;
            if(holdCount==0){
                isLocked=false;
                notify();
                lockedBy=null;

            }

        }

    }
}
