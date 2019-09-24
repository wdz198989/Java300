package 网络编程.net.udp.QQ;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 11:22
 * @Description : 学生
 */
public class WuDazhong {
    public static void main(String[] args) {
        System.out.println("吴大忠上线了");
        new Thread(new TalkSend(7777,"localhost",9999)).start();
        new Thread(new TalkReceive(8888,"鲁慧")).start();
    }
}
