package ������.net.tcp.MyTcp;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : ģ���½
 */
public class LoginServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �����---------");
        //TODO 1 ָ���˿ڣ�ʹ��ServerSocket ����������
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 ����ʽ�ȴ����� accept
        Socket client = server.accept();
        System.out.println("һ���ͻ��˽��������ӡ���������������������������");

        //TODO 3 ����;:����������
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String datas = dis.readUTF();
        String uname ="";
        String upwd="";
        System.out.println("�յ�������Ϊ��" + datas);
        //TODO ��������
        String[] dataArray = datas.split("&");
        for (String info : dataArray) {
            String[] userInfo = info.split("=");
            if (userInfo[0].equals("uname")) {
                System.out.println("����û���Ϊ��" + userInfo[1]);
                uname= userInfo[1];
            } else if (userInfo[0].equals("upwd")) {
                System.out.println("�������Ϊ��" + userInfo[1]);
                upwd=userInfo[1];
            }

        }
        // ���
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        if(uname.equals("wudazhong")&&upwd.equals("123456")){
           dos.writeUTF("��½�ɹ�����ӭ����");
        }else{
            dos.writeUTF("��½ʧ��");
        }
         dos.flush();
        //TODO 4 �ͷ���Դ
        dis.close();
        client.close();


    }
}
