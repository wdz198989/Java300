package 网络编程.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 客户端
 * 1、创建客户端 +端口
 * 2、准备数据
 * 3、打包（发送的地点 及端口）
 * 4、发送
 * 5、释放
 * 
 * 思考: 89.12  数据+类型
 * @author Administrator
 *
 */
public class MyClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("发送方启动中。。。。。。。。。。。。。。。。。。。。。");
		//1、创建客户端 +端口
		DatagramSocket client = new DatagramSocket(6676);
		//2、准备数据
		String msg ="udp编程";
		byte[] data =msg.getBytes();
		//3、打包（发送的地点 及端口） DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8899));
		//4、发送
		client.send(packet);
		//5、释放
		client.close();
		
	}

}
