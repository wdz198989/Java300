package thirtyDayForJava.DingShiRenWu;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author : WuDazhong
 * @Date :2020/10/30 11:48
 * @Description :
 */
public class Test2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
// task to run goes here
                System.out.println("Hello !!");
            }
        };
        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 0, 20, TimeUnit.SECONDS);
    }
}
