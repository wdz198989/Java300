package ������.net.tcp.MyTcp;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 14:01
 * @Description : �ͻ��ˣ��ϴ��ļ�
 */
public class FileClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �ͻ���---------");
        //TODO 1 �������ӣ�ʹ��socket�����ͻ���+ ����ĵ�ַ�Ͷ˿�
        Socket client = new Socket("localhost",8888);
        //TODO 2 �������ļ����� �ϴ�
        InputStream is = new BufferedInputStream(new FileInputStream("src/1.jpg"));
        OutputStream os = new BufferedOutputStream(client.getOutputStream());
        byte[] flush = new byte[1024];
        int len =-1;
        while ((len=is.read(flush))!=-1){
               os.write(flush,0,len);
        }
         os.flush();
        //TODO 3 �ͷ���Դ
        os.close();
        is.close();
        client.close();

    }
}
