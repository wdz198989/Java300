package ������.net.tcp.MyTcp;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 14:01
 * @Description : ����ˣ������ļ�
 */
public class FileServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �����---------");
        //TODO 1 ָ���˿ڣ�ʹ��ServerSocket ����������
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 ����ʽ�ȴ����� accept
        Socket client = server.accept();
        System.out.println("һ���ͻ��˽��������ӡ���������������������������");

        //TODO 3 ����;:���� ����
        InputStream is = new BufferedInputStream(client.getInputStream());
        OutputStream os = new BufferedOutputStream(new FileOutputStream("src/wdz.jpg"));
        byte[] flush = new byte[1024];
        int len = -1;
        while ((len=is.read(flush))!=-1){
            os.write(flush,0,len);
        }
        os.flush();
        //TODO 4 �ͷ���Դ
        client.close();


    }

}
