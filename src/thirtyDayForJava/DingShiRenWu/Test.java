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
        Timer timer = new Timer();// ʵ����Timer��

        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("�˳�");
                this.cancel();
            }
        }, 5000);// ����ٺ���
        System.out.println("���������5����Զ��˳�");
    }
}
