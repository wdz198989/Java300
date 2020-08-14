package 多线程.线程的五种状态;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:11
 * @Description : 测试线程状态
 */
public class TestState  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(() ->{
            for (int i = 0; i < 5; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("线程执行结束！！！");
        });


        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);//NEW

        // 观察启动后
        thread.start();
        state=thread.getState();
        System.out.println(state);//RUN

        while (state != Thread.State.TERMINATED){//只要线程不终止，就一直输出状态
            Thread.sleep(100);
            state=thread.getState();
            System.out.println(state);
        }

       // thread.start(); 线程结束了，无法再start
    }

}
