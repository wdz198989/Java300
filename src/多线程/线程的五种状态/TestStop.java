package 多线程.线程的五种状态;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:39
 * @Description : 测试线程停止
 */
public class TestStop implements Runnable {

    // 设置一个标志位
    private boolean flag =true;

    @Override
    public void run() {
         int i= 0;
         while (flag){
             System.out.println("run --Thread"+i++);
         }
    }

    // 设置一个公开的方法，改变标志位
    public  void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new  Thread(testStop).start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("main"+i);
            if (i==9000){
                //调用stop方法，让线程停止
               testStop.stop();
                System.out.println("线程该停止了");
            }
        }
    }
}
