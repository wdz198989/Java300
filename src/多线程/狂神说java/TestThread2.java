package 多线程.狂神说java;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 18:33
 * @Description : 创建多线程的方式2：实现runable接口，重写run方法，执行线程需要丢入runable接口实现类，调用start方法
 */
public class TestThread2  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码。。。。。。。。。。。。。。。。。"+i);

        }
    }

    public static void main(String[] args) {

        TestThread2 testThread2 = new TestThread2();

        new Thread(testThread2).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程。。。。。。。。。。。。。。。。。。"+i);

        }

    }
}
