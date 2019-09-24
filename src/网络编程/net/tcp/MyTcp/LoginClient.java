package 网络编程.net.tcp.MyTcp;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : 模拟登陆
 */
public class LoginClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 客户端---------");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名：");
        String uname=console.readLine();
        System.out.println("请输入密码：");
        String upwd=console.readLine();
        //TODO 1 建立连接：使用socket创建客户端+ 服务的地址和端口
        Socket client = new Socket("localhost",8888);
        //TODO 2 操作： 输入输出操作流
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String  data="uname="+uname+"&"+"upwd="+upwd;
        dos.writeUTF(data);
        dos.flush();

        DataInputStream dis = new DataInputStream(client.getInputStream());
        String result = dis.readUTF();
        System.out.println(result);
        //TODO 3 释放资源
        dos.close();
        client.close();

    }
}
