package ���߳�.�̵߳�����״̬;


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
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));//��ʽ��ʱ��ķ�ʽ
                startTime=new Date(System.currentTimeMillis());//�˴�һ��Ҫ���»�ȡһ�µ�ǰʱ��
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
