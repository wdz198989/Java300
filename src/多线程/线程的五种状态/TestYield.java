package 多线程.线程的五种状态;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:34
 * @Description : 测试yield
 */
//礼让不一定成功，看cpu心情
public class TestYield {

    public static void main(String[] args) {

        MyYield myYield =new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
    }
}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"线程停止执行");

    }
}
