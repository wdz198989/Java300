package ������.net.udp.QQ;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 11:21
 * @Description : ��ʦ
 */
public class LuHui {
    public static void main(String[] args) {
        System.out.println("³��������");
        new Thread(new TalkReceive(9999,"�����")).start();
        new Thread(new TalkSend(5555,"localhost",8888)).start();
    }
}
