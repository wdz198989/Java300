package 网络编程.net.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 10:40
 * @Description : 对话交流接收端
 */
public class UdpTalkServer {
    public static void main(String[] args) throws IOException {
        System.out.println("接收方方启动中。。。。。。。。。。。。。。。。。。。。。");
        //1、创建服务端 +端口
        DatagramSocket server = new DatagramSocket(7777);
        while (true){
            //2、准备接受容器
            byte[] container = new byte[1024];
            //3、封装成 包 DatagramPacket(byte[] buf, int length)
            DatagramPacket packet =new DatagramPacket(container, container.length) ;
            //4、接受数据
            server.receive(packet);
            //5、分析数据
            byte[] data =packet.getData();
            int len =packet.getLength();
            String datas= new String(data,0,len);
            System.out.println(datas);
            if(datas.equals("bye")){
                break;
            }

        }

        //6、释放
        server.close();

    }

}
