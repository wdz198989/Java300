package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:02
 * @Description : 创建线程的方式二
 */
public class StartRun implements  Runnable{

    @Override
    public  void run(){
        for(int i =0 ;i<200;i++){
            System.out.println("一边唱歌");
        }
    }

    public static void main(String[] args) {
      /*  StartRun sr= new StartRun();
        Thread thread = new Thread(sr);
        thread.start();*/
      new Thread(new StartRun()).start();

        for(int i =0 ;i<200;i++){
            System.out.println("一边coding");
        }
    }
}
