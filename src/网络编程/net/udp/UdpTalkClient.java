package 网络编程.net.udp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 10:37
 * @Description : 对话交流发送端
 */
public class UdpTalkClient {
    public static void main(String[] args) throws IOException {
        System.out.println("发送方启动中。。。。。。。。。。。。。。。。。。。。。");
        //1、创建客户端 +端口
        DatagramSocket client = new DatagramSocket(6676);
        //2、准备数据（一定转成字节数组）
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String msg = reader.readLine();
            byte[] data =msg.getBytes();
            //3、打包（发送的地点 及端口） DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",7777));
            //4、发送
            client.send(packet);
            if(msg.equals("bye")){
                  break;
            }
        }

        //5、释放
        client.close();

    }

}
