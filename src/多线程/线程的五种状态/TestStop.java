package ���߳�.�̵߳�����״̬;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:39
 * @Description : �����߳�ֹͣ
 */
public class TestStop implements Runnable {

    // ����һ����־λ
    private boolean flag =true;

    @Override
    public void run() {
         int i= 0;
         while (flag){
             System.out.println("run --Thread"+i++);
         }
    }

    // ����һ�������ķ������ı��־λ
    public  void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new  Thread(testStop).start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("main"+i);
            if (i==9000){
                //����stop���������߳�ֹͣ
               testStop.stop();
                System.out.println("�̸߳�ֹͣ��");
            }
        }
    }
}
