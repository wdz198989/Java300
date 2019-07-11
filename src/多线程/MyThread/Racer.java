package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:19
 * @Description : 模拟龟兔赛跑
 */
public class Racer implements Runnable {
    private  String winner;
    @Override
    public void run() {
        for(int steps =0;steps<=100;steps ++){
            if(Thread.currentThread().getName().equals("兔子")&&steps%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"走了"+steps);
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
                System.out.println("比赛的胜利者是："+winner);
                return true;
            }
        }
     return  false;
    }

    public static void main(String[] args) {
        Racer racer = new Racer();
        new Thread(racer,"乌龟").start();
        new Thread(racer,"兔子").start();

    }
}
