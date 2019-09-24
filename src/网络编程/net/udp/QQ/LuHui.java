package 网络编程.net.udp.QQ;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 11:21
 * @Description : 老师
 */
public class LuHui {
    public static void main(String[] args) {
        System.out.println("鲁慧上线了");
        new Thread(new TalkReceive(9999,"吴大忠")).start();
        new Thread(new TalkSend(5555,"localhost",8888)).start();
    }
}
