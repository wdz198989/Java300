package 多线程.线程的五种状态;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:23
 * @Description : 测试join方法，想象为插队
 */
public class TestJoin  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("VIP来插队了");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
       //此过程二者是并行执行，一旦插队，则直接等vip执行完，主线程才执行剩下的
        for (int i = 0; i < 1000; i++) {
            if(i==200){
               thread.join();//插队
            }

            System.out.println("我老老实实在排队"+i+"秒");
        }
    }
}
