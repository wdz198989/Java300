package ���߳�.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:42
 * @Description : �̳�Thread��ʵ�ֶ��߳�
 * 1.1���̳�Thread��
 * 1.2����дrun����
 * 1.3��new �µ������
 * 1.4�����������start����
 */
public class ThreadTest01 {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("���Ǵ�");
        MyThread myThread2 = new MyThread("����");
        myThread1.start();
        myThread2.start();
    }
}

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
           this.name=name;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("--------------"+name+"---------------");
        }
    }
}


