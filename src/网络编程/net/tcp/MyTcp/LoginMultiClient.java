package 网络编程.net.tcp.MyTcp;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : 模拟登陆:多客户端
 */
public class LoginMultiClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 客户端---------");
        //TODO 1 建立连接：使用socket创建客户端+ 服务的地址和端口
        Socket client = new Socket("localhost", 8888);
        //TODO 2 操作： 输入输出操作流
        new Request(client).send();
        new Response(client).receive();
        //TODO 3 释放资源
        client.close();

    }

    /**
     * 发送数据 （请求）
     */
    static class Request{
        private Socket client;
        private DataOutputStream dos;
        private BufferedReader console;
        private String msg;

        public Request(Socket client) {
            console = new BufferedReader(new InputStreamReader(System.in));
            this.msg =init();
            this.client = client;
            try {

                 dos = new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         // todo 初始化
        public String init(){
            try {
                System.out.println("请输入用户名：");
                String uname = console.readLine();
                System.out.println("请输入密码：");
                String upwd = console.readLine();
                return  "uname=" + uname + "&" + "upwd=" + upwd;
            } catch (IOException e) {
                e.printStackTrace();
            }
              return "";
        }

        public void send() {
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


    /**
     * 接受数据（响应）
     */
    static class Response{
        private Socket client;
        private DataInputStream dis;

        public Response(Socket client) {
            this.client = client;
            try {
                dis = new DataInputStream(client.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void receive() {
            String result;
            try {
                result = dis.readUTF();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
