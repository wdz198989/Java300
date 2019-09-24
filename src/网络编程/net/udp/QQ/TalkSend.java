package ������.net.udp.QQ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 10:53
 * @Description : ���̷߳��ͷ�
 */
public class TalkSend implements  Runnable {
    private DatagramSocket client ;
    private  BufferedReader reader;
    private String toIp;
    private int  toPort;

    public TalkSend(int port,String toIp,int toPort){
        this.toIp=toIp;
        this.toPort=toPort;
        try {
            client= new DatagramSocket(port);
           reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            String msg;
            try {
                msg = reader.readLine();
                byte[] data =msg.getBytes();
                //3����������͵ĵص� ���˿ڣ�
                DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress(this.toIp,this.toPort));
                //4������
                client.send(packet);
                System.out.println("-----------------����Ϣ���ͳɹ���");

                if(msg.equals("bye")){

                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        //5���ͷ�
        client.close();

    }
}
