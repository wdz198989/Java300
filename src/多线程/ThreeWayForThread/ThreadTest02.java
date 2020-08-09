package 多线程.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:48
 * @Description : 实现Runnable接口（使用静态代理的方式实现的）
 * 2.1、实现Runnable接口
 * 2.2、复写run方法
 * 2.3、new 新的类对象
 * 2.4、new一个Thread对象（传入上面的对象）
 * 2.5、Thread对象调用start方法启动线程
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread02 myThread1 = new MyThread02("周星驰");
        MyThread02 myThread2 = new MyThread02("chenglong");
        Thread thread1 = new Thread( myThread1);
        Thread thread2 = new Thread( myThread2);
        thread1.start();
        thread2.start();
    }
}

class MyThread02 implements Runnable{
    private String name;
    public MyThread02(String name){
        this.name = name;
    }
    public void run() {
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println("------>"+name+"--->"+i);
        }
    }
}
