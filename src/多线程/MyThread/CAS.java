package ���߳�.MyThread;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 0:13
 * @Description : CAS(compare and swap) ԭ�Ӳ��� �Ƚϲ��ҽ�����˼�루 ��������ɱ��
 */
public class CAS {
    /**
     *  ���
     */
    private static AtomicInteger stock = new AtomicInteger(5);

    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
           new Thread(()->{
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               Integer left = stock.decrementAndGet();
               if(left==0){
                   System.out.println(Thread.currentThread().getName()+"��Ʒ������һ���ˡ�����������������������");
                  return;
               }

               System.out.println(Thread.currentThread().getName()+"����һ��,��ʣ"+left+"��");

           }).start();

        }
    }
}
