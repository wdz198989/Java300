package ���߳�.�߳�ͬ��;


/**
 * @Author : WuDazhong
 * @Date :2020/8/15 22:57
 * @Description : ģ����Ʊ
 */
public class UnsafeBuyTickets {

    public static void main(String[] args) {
        BuyTickets station = new BuyTickets();

        new Thread(station,"��Ƶ���").start();
        new Thread(station,"ţ�Ƶ�����").start();
        new Thread(station,"ɵ�ƵĻ�ţ��").start();
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

    // ��syshronized����̰߳�ȫ����
    private /*synchronized*/ void buy() throws InterruptedException {
        //���ж��Ƿ���Ʊ
        if(ticketNum<=0){
           flag=false;
           return;
        }

            Thread.sleep(100);

        System.out.println(Thread.currentThread().getName()+"�õ��˵�"+ticketNum--+"��Ʊ");
    }
}
