package ���߳�.����˵java;


/**
 * @Author : WuDazhong
 * @Date :2020/9/10 22:51
 * @Description : �Լ����˹�˾�Լ�д�Ĵ��룬�ܽ�һ�£����߲���ִ�У��ﵽ�첽Ч��
 */
public class TestThreadMyOwn {

    public static void main(String[] args) {
        for (int i = 0; i < 202; i++) {
            System.out.println("����ѧϰ���̡߳�����������������������������������"+i);

        }

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println("���ڿ����롣��������������������������������"+i);

            }
        }).start();
    }
}
