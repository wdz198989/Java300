package 多线程.线程同步;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author : WuDazhong
 * @Date :2020/8/16 11:13
 * @Description :
 */
public class TestLock {
    public static void main(String[] args) {
        BuyTickets2 tickets2 = new BuyTickets2();

        new Thread(tickets2).start();
        new Thread(tickets2).start();
        new Thread(tickets2).start();

    }
}


class BuyTickets2 implements Runnable{
    int num =10;

    // 定义lock锁
   private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try{
            lock.lock();

            if(num > 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(num--);

            }else{
             break;
            }
            }finally {
              lock.unlock();
            }
        }


    }
}
