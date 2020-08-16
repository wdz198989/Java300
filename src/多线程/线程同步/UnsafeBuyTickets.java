package 多线程.线程同步;


/**
 * @Author : WuDazhong
 * @Date :2020/8/15 22:57
 * @Description : 模拟买票
 */
public class UnsafeBuyTickets {

    public static void main(String[] args) {
        BuyTickets station = new BuyTickets();

        new Thread(station,"苦逼的我").start();
        new Thread(station,"牛逼的你们").start();
        new Thread(station,"傻逼的黄牛党").start();
    }
}


class BuyTickets implements Runnable{
    private int ticketNum=10;
    private boolean flag=true;

    @Override
    public void run() {

        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    // 加syshronized解决线程安全问题
    private /*synchronized*/ void buy() throws InterruptedException {
        //先判断是否有票
        if(ticketNum<=0){
           flag=false;
           return;
        }

            Thread.sleep(100);

        System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNum--+"张票");
    }
}
