package thirtyDayForJava.DingShiRenWu;


import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author : WuDazhong
 * @Date :2020/10/30 11:22
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        Timer timer = new Timer();// 实例化Timer类

        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("退出");
                this.cancel();
            }
        }, 5000);// 这里百毫秒
        System.out.println("本程序存在5秒后自动退出");
    }
}
