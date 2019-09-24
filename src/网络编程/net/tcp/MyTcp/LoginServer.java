package 网络编程.net.tcp.MyTcp;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : 模拟登陆
 */
public class LoginServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 服务端---------");
        //TODO 1 指定端口，使用ServerSocket 创建服务器
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 阻塞式等待连接 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接。。。。。。。。。。。。。。");

        //TODO 3 操作;:输入流操作
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String datas = dis.readUTF();
        String uname ="";
        String upwd="";
        System.out.println("收到的数据为：" + datas);
        //TODO 分析数据
        String[] dataArray = datas.split("&");
        for (String info : dataArray) {
            String[] userInfo = info.split("=");
            if (userInfo[0].equals("uname")) {
                System.out.println("你的用户名为：" + userInfo[1]);
                uname= userInfo[1];
            } else if (userInfo[0].equals("upwd")) {
                System.out.println("你的密码为：" + userInfo[1]);
                upwd=userInfo[1];
            }

        }
        // 输出
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        if(uname.equals("wudazhong")&&upwd.equals("123456")){
           dos.writeUTF("登陆成功，欢迎回来");
        }else{
            dos.writeUTF("登陆失败");
        }
         dos.flush();
        //TODO 4 释放资源
        dis.close();
        client.close();


    }
}
