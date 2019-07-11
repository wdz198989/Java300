package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 0:34
 * @Description : 创建线程方式一
 */
public class StartThread extends Thread{

    @Override
    public  void run(){
        for(int i =0 ;i<200;i++){
            System.out.println("一边唱歌");
        }
    }

    public static void main(String[] args) {
        StartThread st = new StartThread();
        st.start();
        for(int i =0 ;i<200;i++){
            System.out.println("一边coding");
        }
    }
}
