package ���߳�.����˵java;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 18:33
 * @Description : �������̵߳ķ�ʽ2��ʵ��runable�ӿڣ���дrun������ִ���߳���Ҫ����runable�ӿ�ʵ���࣬����start����
 */
public class TestThread2  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("���ڿ����롣��������������������������������"+i);

        }
    }

    public static void main(String[] args) {

        TestThread2 testThread2 = new TestThread2();

        new Thread(testThread2).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("����ѧϰ���̡߳�����������������������������������"+i);

        }

    }
}
