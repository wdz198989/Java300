package 网络编程.net.tcp.MyTcp;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 14:01
 * @Description : 服务端：接受文件
 */
public class FileServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 服务端---------");
        //TODO 1 指定端口，使用ServerSocket 创建服务器
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 阻塞式等待连接 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接。。。。。。。。。。。。。。");

        //TODO 3 操作;:拷贝 下载
        InputStream is = new BufferedInputStream(client.getInputStream());
        OutputStream os = new BufferedOutputStream(new FileOutputStream("src/wdz.jpg"));
        byte[] flush = new byte[1024];
        int len = -1;
        while ((len=is.read(flush))!=-1){
            os.write(flush,0,len);
        }
        os.flush();
        //TODO 4 释放资源
        client.close();


    }

}
