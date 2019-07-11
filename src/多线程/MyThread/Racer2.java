package ���߳�.MyThread;


import java.util.concurrent.*;

/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:40
 * @Description : ͨ��callable
 */
public class Racer2 implements Callable<Integer> {
    private  String winner;
    @Override
    public Integer call() throws Exception {
        for(int steps =0;steps<=100;steps ++){
            if(Thread.currentThread().getName().equals("����")&&steps%10==0){
                Thread.sleep(1);
            }
            System.out.println(Thread.currentThread().getName()+"����"+steps);
            boolean flag = gameOver(steps);
            if(flag){
               return steps;
            }
        }
        return null;
    }

    private boolean gameOver(int steps){
        if(winner!=null){
            return true;
        }else{
            if(steps==100){
                winner=Thread.currentThread().getName();
                System.out.println("������ʤ�����ǣ�"+winner);
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Racer2 racer = new Racer2();
        //TODO ����ִ�з���
        ExecutorService ser = Executors.newFixedThreadPool(2);
        //TODO �ύִ��
        Future<Integer> result1 = ser.submit(racer);
        Future<Integer> result2 = ser.submit(racer);
        //TODO ��ȡ���
        Integer r1 = result1.get();
        Integer r2 = result1.get();
        System.out.println(r2);
        //TODO �رշ���
        ser.shutdownNow();


    }
}
