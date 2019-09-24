package 网络编程.net.tcp.MyTcp;


import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:14
 * @Description : 服务端
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 服务端---------");
        //TODO 1 指定端口，使用ServerSocket 创建服务器
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 阻塞式等待连接 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接。。。。。。。。。。。。。。");

        //TODO 3 操作;:输入流操作
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();
        System.out.println("收到的数据为："+data);
        //TODO 4 释放资源
        dis.close();
        client.close();


    }
}
