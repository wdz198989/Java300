package 网络编程.net.tcp.MyChat;


import java.io.*;
import java.net.Socket;

/**zaiixna
 * @Author : WuDazhong
 * @Date :2019/7/12 16:46
 * @Description : 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 客户端---------");
        //TODO 1 建立连接：使用socket创建客户端+ 服务的地址和端口
        Socket client = new Socket("localhost", 8888);
        //TODO 2 客户端发送消息
       BufferedReader  console = new BufferedReader(new InputStreamReader(System.in));
       String msg= console.readLine();
       DataOutputStream dos = new DataOutputStream(client.getOutputStream());
       dos.writeUTF(msg);
       dos.flush();
        //TODO 3 获取消息
        DataInputStream dis = new DataInputStream(client.getInputStream());
        msg = dis.readUTF();
        System.out.println(msg);

        dos.close();
        dis.close();
        client.close();

    }
}
