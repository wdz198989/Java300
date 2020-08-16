package 多线程.线程同步;


/**
 * @Author : WuDazhong
 * @Date :2020/8/16 10:47
 * @Description : 死锁：多个线程互相抱着对方的资源，然后形成僵持
 */
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1= new Makeup(0,"灰姑凉");
        Makeup g2= new Makeup(1,"白雪公主");
        g1.start();
        g2.start();
    }
}



//口红
class Lipstick{

}
//镜子
class Mirror {

}

//化妆

class Makeup extends Thread{
    //需要的资源只有一份，用static来保证只有一份
    static Lipstick lipstick=new Lipstick();
    static Mirror mirror=new Mirror();

    //选择
    int choice;
    //使用化妆品的人
    String girlName;
    Makeup(int choice,String girlName){
        this.choice=choice;
        this.girlName=girlName;

    }

    @Override
    public void run() {
      //化妆

        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeup() throws InterruptedException {

        if(choice==0){
            synchronized (lipstick){//获得口红的锁
                System.out.println(this.girlName+"拿到了口红");
                Thread.sleep(1000);
                /*synchronized (mirror){
                    System.out.println(this.girlName+"拿到了镜子");
                }*/

            }
            synchronized (mirror){
                System.out.println(this.girlName+"拿到了镜子");
            }

        }else{
            synchronized (mirror){
                System.out.println(this.girlName+"拿到了镜子");
                Thread.sleep(2000);
                /*synchronized (lipstick){
                    System.out.println(this.girlName+"拿到了口红");
                }*/

            }
            synchronized (lipstick){
                System.out.println(this.girlName+"拿到了口红");
            }

        }
    }


}
