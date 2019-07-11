package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 23:33
 * @Description : ����������������������ʹ��
 */
public class LockTes02 {
     Lock lock= new Lock();
     public  void a () throws InterruptedException {
        lock.lock();
         System.out.println("����");
        doSomething();
        lock.unLock();
         System.out.println("����");
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
//����������
class Lock{
    // �Ƿ�ռ��
    private  boolean  isLocked = false;
    //ʹ����
    public synchronized   void lock() throws InterruptedException {
      while (isLocked){
          wait();
      }

      isLocked=true;
    }
    //�ͷ���
    public  synchronized void unLock(){
        isLocked=false;
        notify();
    }
}
