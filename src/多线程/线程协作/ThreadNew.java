package ���߳�.�߳�Э��;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author : WuDazhong
 * @Date :2020/8/16 21:10
 * @Description : �ع��ܽ��̵߳Ĵ���
 */
public class ThreadNew {
    public static void main(String[] args) {
        new MyThread1().start();
        new Thread(new MyThread2()).start();

        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread3());
        new Thread(futureTask).start();

        try {
            Integer integer = futureTask.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}


//1.�̳�Thread��
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1");
    }
}

//2.ʵ��Runable�ӿ�
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread2");
    }
}

//3��ʵ��callable�ӿ�
class MyThread3 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("MyThread3");
        return 100;
    }
}
