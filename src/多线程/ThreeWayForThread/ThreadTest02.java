package ���߳�.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:48
 * @Description : ʵ��Runnable�ӿڣ�ʹ�þ�̬����ķ�ʽʵ�ֵģ�
 * 2.1��ʵ��Runnable�ӿ�
 * 2.2����дrun����
 * 2.3��new �µ������
 * 2.4��newһ��Thread���󣨴�������Ķ���
 * 2.5��Thread�������start���������߳�
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread02 myThread1 = new MyThread02("���ǳ�");
        MyThread02 myThread2 = new MyThread02("chenglong");
        Thread thread1 = new Thread( myThread1);
        Thread thread2 = new Thread( myThread2);
        thread1.start();
        thread2.start();
    }
}

class MyThread02 implements Runnable{
    private String name;
    public MyThread02(String name){
        this.name = name;
    }
    public void run() {
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println("------>"+name+"--->"+i);
        }
    }
}
