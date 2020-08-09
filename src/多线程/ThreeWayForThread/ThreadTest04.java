package 多线程.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 23:00
 * @Description : 三种特殊写法
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        new Thread(){
            private String name ="周星驰";
            public void run(){
                for(int i=0;i<100;i++){
                    try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
                    System.out.println("------>"+name+"--->"+i);
                }
            }
        }.start();

        new Thread(new Runnable(){
            private String name ="成龙";
            public void run() {
                for(int i=0;i<100;i++){
                    try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
                    System.out.println("------>"+name+"--->"+i);
                }
            }
        }).start();

        new Thread(new Thread(){
            private String name ="李连杰";
            public void run() {
                for(int i=0;i<100;i++){
                    try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
                    System.out.println("------>"+name+"--->"+i);
                }
            }
        }).start();
    }
}

