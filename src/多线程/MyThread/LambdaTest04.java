package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 10:27
 * @Description : 测试
 */
public class LambdaTest04 {
    public static void main(String[] args) {


        new Thread(()->{
            for(int i =0 ;i<=10;i++){
                System.out.println("一边学习");
            }
        }).start();

        new Thread(()->System.out.println("一边唱歌")).start();
    }
}
