package ������.net.udp.QQ;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 11:22
 * @Description : ѧ��
 */
public class WuDazhong {
    public static void main(String[] args) {
        System.out.println("�����������");
        new Thread(new TalkSend(7777,"localhost",9999)).start();
        new Thread(new TalkReceive(8888,"³��")).start();
    }
}
