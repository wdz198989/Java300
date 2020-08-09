package ���߳�.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 23:02
 * @Description : yield()��������ͣ�̣߳����Լ���CPUʱ��Ƭ�ó�����ֱ��CPU�ٷָ�ʱ��Ƭ�Ż�������У�
 *    �˷���Ϊstatic������Thread.yield(),д���ĸ��̣߳��ĸ��߳̾���ͣ����sleep����
 */
class ThreadTest06 extends Thread{
    private String name;
    public ThreadTest06(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        ThreadTest06 threadTest06 = new ThreadTest06("����");
        Thread thread = new Thread(threadTest06);
        thread.start();

        for(int i=1;i<100;i++){
            if(i%20==0){Thread.yield();}
            System.out.println("------>main--->"+i);
        }
    }

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("------>"+name+"--->"+i);
        }
    }
}
