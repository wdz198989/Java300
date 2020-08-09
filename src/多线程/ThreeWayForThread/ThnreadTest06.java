package 多线程.ThreeWayForThread;


/**
 * @Author : WuDazhong
 * @Date :2019/10/26 23:02
 * @Description : yield()方法，暂停线程（把自己的CPU时间片让出），直到CPU再分给时间片才会继续运行，
 *    此方法为static方法，Thread.yield(),写在哪个线程，哪个线程就暂停，与sleep相似
 */
class ThreadTest06 extends Thread{
    private String name;
    public ThreadTest06(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        ThreadTest06 threadTest06 = new ThreadTest06("成龙");
        Thread thread = new Thread(threadTest06);
        thread.start();

        for(int i=1;i<100;i++){
            if(i%20==0){Thread.yield();}
            System.out.println("------>main--->"+i);
        }
    }

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("------>"+name+"--->"+i);
        }
    }
}
