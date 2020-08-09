package 多线程.狂神说java;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 19:04
 * @Description : 初shi并发问题
 */
public class TestThread4 implements Runnable {

    //票数
    private int ticketNums=10;
    @Override
    public void run() {

    while (true){
        if(ticketNums<=0){
           break;
        }
        //模拟延时
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---》拿到了第"+ticketNums--+"票");
    }
    }

    public static void main(String[] args) {
        TestThread4 testThread4=new TestThread4();
        new Thread(testThread4,"鲁慧").start();
        new Thread(testThread4,"吴大忠").start();
        new Thread(testThread4,"黄牛党").start();
    }
}
