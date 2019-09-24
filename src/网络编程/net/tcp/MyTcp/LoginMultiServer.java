package 网络编程.net.tcp.MyTcp;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : 模拟登陆: 多客户端
 */
public class LoginMultiServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 服务端---------");
        //TODO 1 指定端口，使用ServerSocket 创建服务器
        ServerSocket server = new ServerSocket(8888);
        boolean isRunning = true;
        //TODO 2 阻塞式等待连接 accept
        while (isRunning) {
            Socket client = server.accept();
            System.out.println("一个客户端建立了连接。。。。。。。。。。。。。。");
            new Thread(new Channel(client)).start();

        }
           server.close();
    }


    /**
     * //TODO 一个channel相当于一个客户端
     */
    static class Channel implements Runnable{
        private Socket client;
        //输入流
        private DataInputStream dis;
        // 输出流
        private  DataOutputStream dos;
        public Channel(Socket client) {
            this.client = client;
            try {
                //输入
                dis = new DataInputStream(client.getInputStream());
                // 输出
                dos = new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
                release();

            }
        }

        @Override
        public void run() {
            //TODO 3 操作;:输入流操作
            String uname = "";
            String upwd = "";
            //TODO 分析数据
            String[] dataArray = receive().split("&");
            for (String info : dataArray) {
                String[] userInfo = info.split("=");
                if (userInfo[0].equals("uname")) {
                    System.out.println("你的用户名为：" + userInfo[1]);
                    uname = userInfo[1];
                } else if (userInfo[0].equals("upwd")) {
                    System.out.println("你的密码为：" + userInfo[1]);
                    upwd = userInfo[1];
                }

            }

            if (uname.equals("wudazhong") && upwd.equals("123456")) {
                send("登陆成功，欢迎回来");
            } else {
                send("登陆失败");
            }
            //TODO 4 释放资源
            release();


        }
        //TODO 接受数据
        private String receive(){
            String datas = "";
            try {
                datas = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return datas;
        }

        //TODO 发送登录结果通知
        private void send (String msg){
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //TODO  释放资源
        private void release(){

            try {
                if(null!=dos){
                    dos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(null!=dis){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(null!=client){
                client.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
