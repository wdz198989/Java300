package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:02
 * @Description : �����̵߳ķ�ʽ��
 */
public class StartRun implements  Runnable{

    @Override
    public  void run(){
        for(int i =0 ;i<200;i++){
            System.out.println("һ�߳���");
        }
    }

    public static void main(String[] args) {
      /*  StartRun sr= new StartRun();
        Thread thread = new Thread(sr);
        thread.start();*/
      new Thread(new StartRun()).start();

        for(int i =0 ;i<200;i++){
            System.out.println("һ��coding");
        }
    }
}
