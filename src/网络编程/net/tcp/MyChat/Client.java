package ������.net.tcp.MyChat;


import java.io.*;
import java.net.Socket;

/**zaiixna
 * @Author : WuDazhong
 * @Date :2019/7/12 16:46
 * @Description : �ͻ���
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �ͻ���---------");
        //TODO 1 �������ӣ�ʹ��socket�����ͻ���+ ����ĵ�ַ�Ͷ˿�
        Socket client = new Socket("localhost", 8888);
        //TODO 2 �ͻ��˷�����Ϣ
       BufferedReader  console = new BufferedReader(new InputStreamReader(System.in));
       String msg= console.readLine();
       DataOutputStream dos = new DataOutputStream(client.getOutputStream());
       dos.writeUTF(msg);
       dos.flush();
        //TODO 3 ��ȡ��Ϣ
        DataInputStream dis = new DataInputStream(client.getInputStream());
        msg = dis.readUTF();
        System.out.println(msg);

        dos.close();
        dis.close();
        client.close();

    }
}
