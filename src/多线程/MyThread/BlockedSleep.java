package 多线程.MyThread;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : WuDazhong
 * @Date :2019/7/11 12:03
 * @Description : 倒计时
 */
public class BlockedSleep {

    public static void main(String[] args) throws InterruptedException {


       Date endTime = new Date(System.currentTimeMillis()+1000*10);
       long end = endTime.getTime();
       while(true){

           System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
           Thread.sleep(1000);
           endTime=new Date(endTime.getTime()-1000);
           if(end -10000>endTime.getTime()){
               break;
           }

       }

    }
}
