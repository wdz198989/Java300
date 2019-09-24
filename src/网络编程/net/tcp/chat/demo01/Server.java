package 网络编程.net.tcp.chat.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建服务器
 * 写出数据：输出流
 * 读取数据：输入流
 * @author Administrator
 *
 */
public class Server {

	public static void main(String[] args) throws IOException {
		System.out.println("-------- 服务端---------");
		//TODO 1 指定端口，使用ServerSocket 创建服务器
		ServerSocket server =new ServerSocket(9999);
		//TODO 2 阻塞式等待连接 accept
		Socket client =server.accept();
		System.out.println("一个客户端建立了连接");
		
		//写出数据
		//输入流
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg =dis.readUTF();
		//输出流
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("服务器-->"+msg);
		dos.flush();

		
	}

}
