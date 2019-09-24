package ������.net.tcp.MyChat2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *   ���������ң�  ������
 *  Ŀ�꣺ ʹ�ö��߳�ʵ�ֶ���ͻ����������շ�������Ϣ
 * @Author : WuDazhong
 * @Date :2019/7/12 16:45
 * @Description :
 */
public class MultiChat {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �����---------");
        //TODO 1 ָ���˿ڣ�ʹ��ServerSocket ����������
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 ����ʽ�ȴ����� accept
        while (true){
            Socket client = server.accept();
            System.out.println("һ���ͻ��˽��������ӡ���������������������������");
             new Thread(()->{
                 DataInputStream dis = null;
                 DataOutputStream dos=null;
                 try {
                     dis = new DataInputStream(client.getInputStream());
                     dos = new DataOutputStream(client.getOutputStream());
                 } catch (IOException e) {
                     e.printStackTrace();
                 }


                 boolean isRunning=true;
                 while (isRunning) {
                     //TODO 3������Ϣ
                     String msg = null;
                     try {
                         msg = dis.readUTF();
                         //TODO 4 ������Ϣ
                         dos.writeUTF(msg);
                         dos.flush();
                     } catch (IOException e) {
                         e.printStackTrace();
                         isRunning=false;
                     }

                 }
                 try {
                     if(null != dos){
                         dos.close();
                     }
                     } catch (IOException e) {
                     e.printStackTrace();
                 }
                 try {
                     if(null != dis){
                         dis.close();
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 try {
                     if(null != client){
                         client.close();
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

             }).start();


        }


    }
}
