package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 23:33
 * @Description : 不可重入锁：锁不能延续使用
 */
public class LockTes02 {
     Lock lock= new Lock();
     public  void a () throws InterruptedException {
        lock.lock();
         System.out.println("上锁");
        doSomething();
        lock.unLock();
         System.out.println("解锁");
     }
    public  void doSomething () throws InterruptedException {
         lock.lock();
         lock.unLock();

    }
    public static void main(String[] args) throws InterruptedException {

        LockTes02 test = new LockTes02();
        test.a();
        test.doSomething();

    }
}
//不可重入锁
class Lock{
    // 是否占用
    private  boolean  isLocked = false;
    //使用锁
    public synchronized   void lock() throws InterruptedException {
      while (isLocked){
          wait();
      }

      isLocked=true;
    }
    //释放锁
    public  synchronized void unLock(){
        isLocked=false;
        notify();
    }
}
