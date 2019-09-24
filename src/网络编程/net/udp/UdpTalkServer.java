package ������.net.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 10:40
 * @Description : �Ի��������ն�
 */
public class UdpTalkServer {
    public static void main(String[] args) throws IOException {
        System.out.println("���շ��������С�����������������������������������������");
        //1����������� +�˿�
        DatagramSocket server = new DatagramSocket(7777);
        while (true){
            //2��׼����������
            byte[] container = new byte[1024];
            //3����װ�� �� DatagramPacket(byte[] buf, int length)
            DatagramPacket packet =new DatagramPacket(container, container.length) ;
            //4����������
            server.receive(packet);
            //5����������
            byte[] data =packet.getData();
            int len =packet.getLength();
            String datas= new String(data,0,len);
            System.out.println(datas);
            if(datas.equals("bye")){
                break;
            }

        }

        //6���ͷ�
        server.close();

    }

}
