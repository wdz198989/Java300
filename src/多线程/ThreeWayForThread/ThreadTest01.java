package 多线程.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:42
 * @Description : 继承Thread类实现多线程
 * 1.1、继承Thread类
 * 1.2、复写run方法
 * 1.3、new 新的类对象
 * 1.4、调用新类的start方法
 */
public class ThreadTest01 {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("周星次");
        MyThread myThread2 = new MyThread("成龙");
        myThread1.start();
        myThread2.start();
    }
}

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
           this.name=name;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("--------------"+name+"---------------");
        }
    }
}


