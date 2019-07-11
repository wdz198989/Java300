package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 11:21
 * @Description : 线程终止
 */
public class TerminateThread implements Runnable {
   //TODO 1 加入标识。标记线程体是否可以运行
    private boolean flag = true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i =0 ;
        //TODO  关联标识
        while(flag){
            System.out.println(name+"---"+i++);
        }

    }

    //Todo  对外提供方法，改变标识
    public  void terminate(){
        this.flag=false;
    }

    public static void main(String[] args) {
     TerminateThread tt = new TerminateThread("C罗");
     new Thread(tt).start();

        for (int i = 0; i <=99; i++) {
          if(i==88){
             tt.terminate();
              System.out.println("tt game over");
          }
            System.out.println("main--》" +i);
        }
    }
}
