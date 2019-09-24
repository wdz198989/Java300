package 网络编程.net.tcp.MyTcp;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:14
 * @Description : 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 客户端---------");
        //TODO 1 建立连接：使用socket创建客户端+ 服务的地址和端口
        Socket client = new Socket("localhost",8888);
        //TODO 2 操作： 输入输出操作流
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String  data="Hello";
        dos.writeUTF(data);
        dos.flush();
        //TODO 3 释放资源
        dos.close();
        client.close();

    }
}
