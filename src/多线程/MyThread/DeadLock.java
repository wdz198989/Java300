package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/27 22:17
 * @Description :
 * �����������ͬ����������໥���ͷ���Դ���Ӷ��໥�ȴ���һ�㷢����ͬ���г��ж���������
 * <p>
 * ���⣺ ��Ҫ��ͬһ��������У�ͬʱ���ж����������
 */
public class DeadLock {

    public static void main(String[] args) {

        Markup g1 = new Markup(1,"����");
        Markup g2 = new Markup(2,"����");
        g1.start();
        g2.start();


    }
}

//�ں�
class Lipstick {

}

//����
class Mirror {

}
//��ױ

class Markup extends Thread {
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String girl;

    public Markup(int choice, String girl) {
        this.choice = choice;
        this.girl = girl;
    }


    @Override
    public void run() {
        markup();
    }

    private void markup() {
        if (choice == 0) {
            synchronized (lipstick) {
                System.out.println(this.girl + "��ÿں�");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (mirror) {
                System.out.println(this.girl + "��þ���");
            }
        }else{

            synchronized (mirror) {
                System.out.println(this.girl + "��þ���");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

            synchronized (lipstick) {
                System.out.println(this.girl + "��ÿں�");
            }
        }

    }

}
