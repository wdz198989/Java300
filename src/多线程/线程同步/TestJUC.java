package ���߳�.�߳�ͬ��;


import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author : WuDazhong
 * @Date :2020/8/16 10:35
 * @Description : ����JUC��ȫ���͵ļ���
 */
public class TestJUC {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {

            new Thread(()->{

                    list.add(Thread.currentThread().getName());


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
