package 网络编程.net.tcp.MyChat2;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 16:46
 * @Description : 客户端
 */
public class MultiClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 客户端---------");
        //TODO 1 建立连接：使用socket创建客户端+ 服务的地址和端口
        Socket client = new Socket("localhost", 8888);
        //TODO 2 客户端发送消息
       BufferedReader  console = new BufferedReader(new InputStreamReader(System.in));
       DataOutputStream dos = new DataOutputStream(client.getOutputStream());
       DataInputStream dis = new DataInputStream(client.getInputStream());
       boolean isRunning=true;
       while (isRunning){
           String msg= console.readLine();
           dos.writeUTF(msg);
           dos.flush();
           //TODO 3 获取消息
           msg = dis.readUTF();
           System.out.println(msg);

       }

       dos.close();
        dis.close();
        client.close();

    }
}
