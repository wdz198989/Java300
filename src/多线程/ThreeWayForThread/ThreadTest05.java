package 多线程.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 23:01
 * @Description : Join()方法，合并线程，是把被调用的线程合并到主线程中，并行变串行，主线程进入等待，直到被合并进来的线程执行完后，
 * 主线程才继续进行
 */
public class ThreadTest05 extends Thread{
    private String name;
    public ThreadTest05(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        ThreadTest05 threadTest05 = new ThreadTest05("成龙");
        Thread thread = new Thread(threadTest05);
        thread.start();

        for(int i=0;i<100;i++){
            if(i==50){try {thread.join();} catch (InterruptedException e) {e.printStackTrace();}}
            try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("------>main--->"+i);
        }
    }

    public void run(){
        for(int i=0;i<100;i++){
            try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("------>"+name+"--->"+i);
        }
    }
}

//此程序先是两线程一起跑，等到主线程I==50时，主线程停下，等待子线程thread执行完，主线程才继续执行
