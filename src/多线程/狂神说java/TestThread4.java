package ���߳�.����˵java;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 19:04
 * @Description : ��shi��������
 */
public class TestThread4 implements Runnable {

    //Ʊ��
    private int ticketNums=10;
    @Override
    public void run() {

    while (true){
        if(ticketNums<=0){
           break;
        }
        //ģ����ʱ
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---���õ��˵�"+ticketNums--+"Ʊ");
    }
    }

    public static void main(String[] args) {
        TestThread4 testThread4=new TestThread4();
        new Thread(testThread4,"³��").start();
        new Thread(testThread4,"�����").start();
        new Thread(testThread4,"��ţ��").start();
    }
}
