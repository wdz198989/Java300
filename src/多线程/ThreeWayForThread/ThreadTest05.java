package ���߳�.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 23:01
 * @Description : Join()�������ϲ��̣߳��ǰѱ����õ��̺߳ϲ������߳��У����б䴮�У����߳̽���ȴ���ֱ�����ϲ��������߳�ִ�����
 * ���̲߳ż�������
 */
public class ThreadTest05 extends Thread{
    private String name;
    public ThreadTest05(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        ThreadTest05 threadTest05 = new ThreadTest05("����");
        Thread thread = new Thread(threadTest05);
        thread.start();

        for(int i=0;i<100;i++){
            if(i==50){try {thread.join();} catch (InterruptedException e) {e.printStackTrace();}}
            try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("------>main--->"+i);
        }
    }

    public void run(){
        for(int i=0;i<100;i++){
            try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("------>"+name+"--->"+i);
        }
    }
}

//�˳����������߳�һ���ܣ��ȵ����߳�I==50ʱ�����߳�ͣ�£��ȴ����߳�threadִ���꣬���̲߳ż���ִ��
