package ������.net.tcp.MyTcp;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:14
 * @Description : �ͻ���
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �ͻ���---------");
        //TODO 1 �������ӣ�ʹ��socket�����ͻ���+ ����ĵ�ַ�Ͷ˿�
        Socket client = new Socket("localhost",8888);
        //TODO 2 ������ �������������
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String  data="Hello";
        dos.writeUTF(data);
        dos.flush();
        //TODO 3 �ͷ���Դ
        dos.close();
        client.close();

    }
}
