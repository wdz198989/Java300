package ���߳�.�̵߳�����״̬;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:11
 * @Description : �����߳�״̬
 */
public class TestState  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(() ->{
            for (int i = 0; i < 5; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("�߳�ִ�н���������");
        });


        //�۲�״̬
        Thread.State state = thread.getState();
        System.out.println(state);//NEW

        // �۲�������
        thread.start();
        state=thread.getState();
        System.out.println(state);//RUN

        while (state != Thread.State.TERMINATED){//ֻҪ�̲߳���ֹ����һֱ���״̬
            Thread.sleep(100);
            state=thread.getState();
            System.out.println(state);
        }

       // thread.start(); �߳̽����ˣ��޷���start
    }

}
