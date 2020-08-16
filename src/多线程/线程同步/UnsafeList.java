package 多线程.线程同步;


import java.util.ArrayList;

/**
 * @Author : WuDazhong
 * @Date :2020/8/15 23:07
 * @Description : list的线程不安全性
 */
public class UnsafeList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        for (int i = 0; i < 10000; i++) {

            new Thread(()->{
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }

            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
