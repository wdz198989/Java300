package ������.net.tcp.MyChat2;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 16:46
 * @Description : �ͻ���
 */
public class MultiClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �ͻ���---------");
        //TODO 1 �������ӣ�ʹ��socket�����ͻ���+ ����ĵ�ַ�Ͷ˿�
        Socket client = new Socket("localhost", 8888);
        //TODO 2 �ͻ��˷�����Ϣ
       BufferedReader  console = new BufferedReader(new InputStreamReader(System.in));
       DataOutputStream dos = new DataOutputStream(client.getOutputStream());
       DataInputStream dis = new DataInputStream(client.getInputStream());
       boolean isRunning=true;
       while (isRunning){
           String msg= console.readLine();
           dos.writeUTF(msg);
           dos.flush();
           //TODO 3 ��ȡ��Ϣ
           msg = dis.readUTF();
           System.out.println(msg);

       }

       dos.close();
        dis.close();
        client.close();

    }
}
