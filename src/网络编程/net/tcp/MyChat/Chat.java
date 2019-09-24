package ������.net.tcp.MyChat;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ���������ң�  ������
 *  Ŀ�꣺ ʵ��һ���ͻ����������շ�һ����Ϣ
 * @Author : WuDazhong
 * @Date :2019/7/12 16:45
 * @Description : �ͻ��ˣ� ʵ��һ���ͻ����������շ���Ϣ
 */
public class Chat {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �����---------");
        //TODO 1 ָ���˿ڣ�ʹ��ServerSocket ����������
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 ����ʽ�ȴ����� accept
        Socket client = server.accept();
        System.out.println("һ���ͻ��˽��������ӡ���������������������������");
        //TODO 3������Ϣ
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String msg = dis.readUTF();
        //TODO 4 ������Ϣ
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(msg);
        dos.flush();

        dos.close();
        dis.close();
        client.close();

    }
}
