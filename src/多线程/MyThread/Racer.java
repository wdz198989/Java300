package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:19
 * @Description : ģ���������
 */
public class Racer implements Runnable {
    private  String winner;
    @Override
    public void run() {
        for(int steps =0;steps<=100;steps ++){
            if(Thread.currentThread().getName().equals("����")&&steps%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"����"+steps);
            boolean flag = gameOver(steps);
            if(flag){
                break;
            }
        }
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

    public static void main(String[] args) {
        Racer racer = new Racer();
        new Thread(racer,"�ڹ�").start();
        new Thread(racer,"����").start();

    }
}
