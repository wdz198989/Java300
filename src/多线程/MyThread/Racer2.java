package 多线程.MyThread;


import java.util.concurrent.*;

/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:40
 * @Description : 通过callable
 */
public class Racer2 implements Callable<Integer> {
    private  String winner;
    @Override
    public Integer call() throws Exception {
        for(int steps =0;steps<=100;steps ++){
            if(Thread.currentThread().getName().equals("兔子")&&steps%10==0){
                Thread.sleep(1);
            }
            System.out.println(Thread.currentThread().getName()+"走了"+steps);
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
                System.out.println("比赛的胜利者是："+winner);
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Racer2 racer = new Racer2();
        //TODO 创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(2);
        //TODO 提交执行
        Future<Integer> result1 = ser.submit(racer);
        Future<Integer> result2 = ser.submit(racer);
        //TODO 获取结果
        Integer r1 = result1.get();
        Integer r2 = result1.get();
        System.out.println(r2);
        //TODO 关闭服务
        ser.shutdownNow();


    }
}
