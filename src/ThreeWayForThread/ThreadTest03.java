package ThreeWayForThread;


import java.util.concurrent.*;

/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:56
 * @Description : 实现Callable接口
 */
public class ThreadTest03 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService ser = Executors.newFixedThreadPool(2);
        MyThread03 myThread1 = new MyThread03("周星驰");
        MyThread03 myThread2 = new MyThread03("成龙");
        Future<String> future1 =ser.submit(myThread1);
        Future<String> future2 =ser.submit(myThread2);
        Thread.sleep(5000);
        myThread1.setFlag(false);
        myThread2.setFlag(false);
        String result1 =future1.get();
        String result2 =future2.get();
        System.out.println("-----------------------");
        System.out.println(result1);
        System.out.println(result2);
        ser.shutdownNow();
    }
}
//        3.1、实现Callable接口
//        3.2、复写call方法（返回值类型需与Callable接口的泛型一致）
//        3.3、ExecutorService ser = Executors.newFixedThreadPool(2)创建一个线程池，用于启动线程
//        3.4、new一个线程对象
//        3.5、定义一个Future类型的参数接受线程池提交的线程对象后的“未来值”
//        3.6、通过Future的get()方法，获取到线程返回的值，该方法会阻塞线程，即调用该方法后，主线程会等到新启的线程
//             结束拿到结果后，才会执行后面的代码
//        3.7、调用shutdownNow()方法，关闭线程池（否则主线程不会结束）
class MyThread03 implements Callable<String> {
    private String name;
    private boolean flag =true;
    public MyThread03(String name){
        this.name = name;
    }
    public String call() throws Exception {
        int i = 0;
        while(flag){
            try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
            i++;
            System.out.println("------>"+name+"--->"+i);
        }
        return name;
    }
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
