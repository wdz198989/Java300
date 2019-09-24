package ������.net.udp.QQ;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 10:54
 * @Description : ���߳̽��ܷ�
 */
public class TalkReceive implements  Runnable {
     private DatagramSocket server;
     private String from ;
     public TalkReceive(int port,String from){
         this.from=from;
         try {
             server = new DatagramSocket(port);
         } catch (SocketException e) {
             e.printStackTrace();
         }
     }


    @Override
    public void run() {

        while (true){
            //2��׼����������
            byte[] container = new byte[1024];
            //3����װ�� �� DatagramPacket(byte[] buf, int length)
            DatagramPacket packet =new DatagramPacket(container, container.length) ;
            //4����������
            try {
                server.receive(packet);
                //5����������
                byte[] data =packet.getData();
                int len =packet.getLength();
                String datas= new String(data,0,len);
                if(datas.equals("bye")){
                    System.out.println("---------------�� �Է������ˣ�");
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        //6���ͷ�
        server.close();

    }

    }

