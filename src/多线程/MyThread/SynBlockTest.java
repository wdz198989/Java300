package 多线程.MyThread;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/7/11 15:44
 * @Description : 测试容器中添加数据的线程不安全问题
 */
public class SynBlockTest {
    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        for (int i = 0; i <1000; i++) {
            new Thread(()->{
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }

            }).start();
        }
        Thread.sleep(1000);
        System.out.println(list.size());
    }
}
