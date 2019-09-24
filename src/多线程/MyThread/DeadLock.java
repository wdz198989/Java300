package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/27 22:17
 * @Description :
 * 死锁：过多的同步可能造成相互不释放资源，从而相互等待，一般发生于同步中持有多个对象的锁
 * <p>
 * 避免： 不要在同一个代码块中，同时持有多个对象锁。
 */
public class DeadLock {

    public static void main(String[] args) {

        Markup g1 = new Markup(1,"张三");
        Markup g2 = new Markup(2,"李四");
        g1.start();
        g2.start();


    }
}

//口红
class Lipstick {

}

//镜子
class Mirror {

}
//化妆

class Markup extends Thread {
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String girl;

    public Markup(int choice, String girl) {
        this.choice = choice;
        this.girl = girl;
    }


    @Override
    public void run() {
        markup();
    }

    private void markup() {
        if (choice == 0) {
            synchronized (lipstick) {
                System.out.println(this.girl + "获得口红");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (mirror) {
                System.out.println(this.girl + "获得镜子");
            }
        }else{

            synchronized (mirror) {
                System.out.println(this.girl + "获得镜子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

            synchronized (lipstick) {
                System.out.println(this.girl + "获得口红");
            }
        }

    }

}
