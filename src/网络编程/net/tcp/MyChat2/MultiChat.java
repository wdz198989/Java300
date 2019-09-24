package 网络编程.net.tcp.MyChat2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *   在线聊天室：  服务器
 *  目标： 使用多线程实现多个客户可以正常收发多条信息
 * @Author : WuDazhong
 * @Date :2019/7/12 16:45
 * @Description :
 */
public class MultiChat {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 服务端---------");
        //TODO 1 指定端口，使用ServerSocket 创建服务器
        ServerSocket server = new ServerSocket(8888);
        //TODO 2 阻塞式等待连接 accept
        while (true){
            Socket client = server.accept();
            System.out.println("一个客户端建立了连接。。。。。。。。。。。。。。");
             new Thread(()->{
                 DataInputStream dis = null;
                 DataOutputStream dos=null;
                 try {
                     dis = new DataInputStream(client.getInputStream());
                     dos = new DataOutputStream(client.getOutputStream());
                 } catch (IOException e) {
                     e.printStackTrace();
                 }


                 boolean isRunning=true;
                 while (isRunning) {
                     //TODO 3接受消息
                     String msg = null;
                     try {
                         msg = dis.readUTF();
                         //TODO 4 返回消息
                         dos.writeUTF(msg);
                         dos.flush();
                     } catch (IOException e) {
                         e.printStackTrace();
                         isRunning=false;
                     }

                 }
                 try {
                     if(null != dos){
                         dos.close();
                     }
                     } catch (IOException e) {
                     e.printStackTrace();
                 }
                 try {
                     if(null != dis){
                         dis.close();
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                 try {
                     if(null != client){
                         client.close();
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

             }).start();


        }


    }
}
