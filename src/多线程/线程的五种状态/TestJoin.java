package ���߳�.�̵߳�����״̬;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:23
 * @Description : ����join����������Ϊ���
 */
public class TestJoin  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("VIP�������");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
       //�˹��̶����ǲ���ִ�У�һ����ӣ���ֱ�ӵ�vipִ���꣬���̲߳�ִ��ʣ�µ�
        for (int i = 0; i < 1000; i++) {
            if(i==200){
               thread.join();//���
            }

            System.out.println("������ʵʵ���Ŷ�"+i+"��");
        }
    }
}
