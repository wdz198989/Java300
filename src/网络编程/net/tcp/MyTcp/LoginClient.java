package ������.net.tcp.MyTcp;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : ģ���½
 */
public class LoginClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �ͻ���---------");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�������û�����");
        String uname=console.readLine();
        System.out.println("���������룺");
        String upwd=console.readLine();
        //TODO 1 �������ӣ�ʹ��socket�����ͻ���+ ����ĵ�ַ�Ͷ˿�
        Socket client = new Socket("localhost",8888);
        //TODO 2 ������ �������������
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String  data="uname="+uname+"&"+"upwd="+upwd;
        dos.writeUTF(data);
        dos.flush();

        DataInputStream dis = new DataInputStream(client.getInputStream());
        String result = dis.readUTF();
        System.out.println(result);
        //TODO 3 �ͷ���Դ
        dos.close();
        client.close();

    }
}
