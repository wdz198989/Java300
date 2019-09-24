package ������.net.udp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 10:37
 * @Description : �Ի��������Ͷ�
 */
public class UdpTalkClient {
    public static void main(String[] args) throws IOException {
        System.out.println("���ͷ������С�����������������������������������������");
        //1�������ͻ��� +�˿�
        DatagramSocket client = new DatagramSocket(6676);
        //2��׼�����ݣ�һ��ת���ֽ����飩
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String msg = reader.readLine();
            byte[] data =msg.getBytes();
            //3����������͵ĵص� ���˿ڣ� DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",7777));
            //4������
            client.send(packet);
            if(msg.equals("bye")){
                  break;
            }
        }

        //5���ͷ�
        client.close();

    }

}
