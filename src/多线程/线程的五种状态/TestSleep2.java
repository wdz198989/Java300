package 多线程.线程的五种状态;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:59
 * @Description :
 */
public class TestSleep2 {
    public static void main(String[] args) {
        Date startTime = new Date(System.currentTimeMillis());
        System.out.println();
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));//格式化时间的方式
                startTime=new Date(System.currentTimeMillis());//此处一定要重新获取一下当前时间
                System.out.println(startTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

  /*  public static void tenDown() throws InterruptedException {
        int num =10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0){
                break;
            }
        }
    }*/
}
