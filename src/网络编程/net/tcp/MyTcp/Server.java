package ������.net.tcp.MyTcp;


import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:14
 * @Description : �����
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �����---------");
        //TODO 1 ָ���˿ڣ�ʹ��ServerSocket ����������
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 ����ʽ�ȴ����� accept
        Socket client = server.accept();
        System.out.println("һ���ͻ��˽��������ӡ���������������������������");

        //TODO 3 ����;:����������
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();
        System.out.println("�յ�������Ϊ��"+data);
        //TODO 4 �ͷ���Դ
        dis.close();
        client.close();


    }
}
