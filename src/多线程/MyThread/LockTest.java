package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 23:28
 * @Description : ��������
 */
public class LockTest {
    public  void test(){
        //TODO ��һ�λ�ȡ��
        synchronized (this){
            while (true){
                //TODO ��2�λ�ȡ ͬ������
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
