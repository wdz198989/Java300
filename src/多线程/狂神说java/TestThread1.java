package ���߳�.����˵java;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 18:17
 * @Description : �������̵߳ķ�ʽһ���̳�Thread�࣬��дrun����������start�����߳�
 */
public class TestThread1 extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("���ڿ����롣��������������������������������"+i);
            
        }
    }

    public static void main(String[] args) {

        TestThread1 testThread1 = new TestThread1();

        testThread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("����ѧϰ���̡߳�����������������������������������"+i);
            
        }

    }
}
