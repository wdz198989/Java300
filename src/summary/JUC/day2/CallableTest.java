package summary.JUC.day2;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author : WuDazhong
 * @Date :2019/7/27 23:19
 * @Description :
 */
public class CallableTest{

    public static void main(String[] args) {

        CallableDemo cd = new CallableDemo();
        FutureTask<Integer> task = new FutureTask<>(cd);
        new Thread(task).start();

        try {
           int sum = task.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


}
class CallableDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        int sum =0 ;
        for(int i =0;i<=100;i++){
          sum += i;
        }
        return sum;
    }
}