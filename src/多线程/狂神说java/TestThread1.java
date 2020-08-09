package 多线程.狂神说java;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 18:17
 * @Description : 创建多线程的方式一：继承Thread类，重写run方法，调用start开启线程
 */
public class TestThread1 extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码。。。。。。。。。。。。。。。。。"+i);
            
        }
    }

    public static void main(String[] args) {

        TestThread1 testThread1 = new TestThread1();

        testThread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程。。。。。。。。。。。。。。。。。。"+i);
            
        }

    }
}
