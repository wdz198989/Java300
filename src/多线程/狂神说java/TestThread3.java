package 多线程.狂神说java;


import java.util.concurrent.*;

/**
 * @Author : WuDazhong
 * @Date :2020/8/9 18:39
 * @Description : 创建多线程的方式三
 */
public class TestThread3 implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码。。。。。。。。。。。。。。。。。"+i);

        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // new Callable的实现类
        TestThread3 testThread3 = new TestThread3();
        // 创建执行任务
        ExecutorService service = Executors.newFixedThreadPool(1);
        //提交执行
        Future<Boolean> submit = service.submit(testThread3);
        // 获取结果
        Boolean aBoolean = submit.get();
        //关闭服务
        service.shutdown();


    }
}
