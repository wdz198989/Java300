package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 10:27
 * @Description : ����
 */
public class LambdaTest04 {
    public static void main(String[] args) {


        new Thread(()->{
            for(int i =0 ;i<=10;i++){
                System.out.println("һ��ѧϰ");
            }
        }).start();

        new Thread(()->System.out.println("һ�߳���")).start();
    }
}
