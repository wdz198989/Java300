package 多线程.MyThread;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 0:13
 * @Description : CAS(compare and swap) 原子操作 比较并且交换的思想（ 可用于秒杀）
 */
public class CAS {
    /**
     *  库存
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
                   System.out.println(Thread.currentThread().getName()+"商品被抢购一空了。。。。。。。。。。。。");
                  return;
               }

               System.out.println(Thread.currentThread().getName()+"抢了一件,还剩"+left+"件");

           }).start();

        }
    }
}
