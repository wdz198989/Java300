package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 0:34
 * @Description : �����̷߳�ʽһ
 */
public class StartThread extends Thread{

    @Override
    public  void run(){
        for(int i =0 ;i<200;i++){
            System.out.println("һ�߳���");
        }
    }

    public static void main(String[] args) {
        StartThread st = new StartThread();
        st.start();
        for(int i =0 ;i<200;i++){
            System.out.println("һ��coding");
        }
    }
}
