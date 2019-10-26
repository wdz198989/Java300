package ThreeWayForThread;


import java.util.concurrent.*;

/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:56
 * @Description : ʵ��Callable�ӿ�
 */
public class ThreadTest03 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService ser = Executors.newFixedThreadPool(2);
        MyThread03 myThread1 = new MyThread03("���ǳ�");
        MyThread03 myThread2 = new MyThread03("����");
        Future<String> future1 =ser.submit(myThread1);
        Future<String> future2 =ser.submit(myThread2);
        Thread.sleep(5000);
        myThread1.setFlag(false);
        myThread2.setFlag(false);
        String result1 =future1.get();
        String result2 =future2.get();
        System.out.println("-----------------------");
        System.out.println(result1);
        System.out.println(result2);
        ser.shutdownNow();
    }
}
//        3.1��ʵ��Callable�ӿ�
//        3.2����дcall����������ֵ��������Callable�ӿڵķ���һ�£�
//        3.3��ExecutorService ser = Executors.newFixedThreadPool(2)����һ���̳߳أ����������߳�
//        3.4��newһ���̶߳���
//        3.5������һ��Future���͵Ĳ��������̳߳��ύ���̶߳����ġ�δ��ֵ��
//        3.6��ͨ��Future��get()��������ȡ���̷߳��ص�ֵ���÷����������̣߳������ø÷��������̻߳�ȵ��������߳�
//             �����õ�����󣬲Ż�ִ�к���Ĵ���
//        3.7������shutdownNow()�������ر��̳߳أ��������̲߳��������
class MyThread03 implements Callable<String> {
    private String name;
    private boolean flag =true;
    public MyThread03(String name){
        this.name = name;
    }
    public String call() throws Exception {
        int i = 0;
        while(flag){
            try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
            i++;
            System.out.println("------>"+name+"--->"+i);
        }
        return name;
    }
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
