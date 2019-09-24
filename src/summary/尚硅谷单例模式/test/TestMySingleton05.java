package summary.尚硅谷单例模式.test;


import summary.尚硅谷单例模式.MySingleton05;

import java.util.concurrent.*;

/**
 * @Author : WuDazhong
 * @Date :2019/7/15 14:29
 * @Description : 测试
 */
public class TestMySingleton05 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Callable<MySingleton05> c =() -> MySingleton05.getInstance();

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<MySingleton05> f1 = es.submit(c);
        Future<MySingleton05> f2 = es.submit(c);
        MySingleton05 s1 = f1.get();
        MySingleton05 s2 = f2.get();
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);

    }
}
