package 多线程.狂神说java;


/**
 * @Author : WuDazhong
 * @Date :2020/9/10 22:51
 * @Description : 自己看了公司自己写的代码，总结一下：两者并行执行，达到异步效果
 */
public class TestThreadMyOwn {

    public static void main(String[] args) {
        for (int i = 0; i < 202; i++) {
            System.out.println("我在学习多线程。。。。。。。。。。。。。。。。。。"+i);

        }

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println("我在看代码。。。。。。。。。。。。。。。。。"+i);

            }
        }).start();
    }
}
