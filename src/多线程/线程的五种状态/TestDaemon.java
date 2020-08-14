package 多线程.线程的五种状态;


/**
 * @Author : WuDazhong
 * @Date :2020/8/14 22:58
 * @Description : 测试守护线程
 */

// 模拟上帝守护人类
public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        Human human=new Human();
        Thread thread=new Thread(god);
        thread.setDaemon(true);
        thread.start();
        new Thread(human).start();

    }

}

class  God implements Runnable{


    @Override
    public void run() {
        while (true){
            System.out.println("上帝守护着人类");
        }
    }
}

class Human implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("每天开心的活着");
        }

        System.out.println("跟世界说拜拜");
    }
}


