package 网络编程.net.tcp.MyChat;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 在线聊天室：  服务器
 *  目标： 实现一个客户可以正常收发一条信息
 * @Author : WuDazhong
 * @Date :2019/7/12 16:45
 * @Description : 客户端： 实现一个客户可以正常收发信息
 */
public class Chat {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 服务端---------");
        //TODO 1 指定端口，使用ServerSocket 创建服务器
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 阻塞式等待连接 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接。。。。。。。。。。。。。。");
        //TODO 3接受消息
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String msg = dis.readUTF();
        //TODO 4 返回消息
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(msg);
        dos.flush();

        dos.close();
        dis.close();
        client.close();

    }
}
