package ���߳�.�̵߳�����״̬;


/**
 * @Author : WuDazhong
 * @Date :2020/8/14 22:58
 * @Description : �����ػ��߳�
 */

// ģ���ϵ��ػ�����
public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        Human human=new Human();
        Thread thread=new Thread(god);
        thread.setDaemon(true);
        thread.start();
        new Thread(human).start();

    }

}

class  God implements Runnable{


    @Override
    public void run() {
        while (true){
            System.out.println("�ϵ��ػ�������");
        }
    }
}

class Human implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("ÿ�쿪�ĵĻ���");
        }

        System.out.println("������˵�ݰ�");
    }
}


