package ������.net.tcp.chat.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����������
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * @author Administrator
 *
 */
public class Server {

	public static void main(String[] args) throws IOException {
		System.out.println("-------- �����---------");
		//TODO 1 ָ���˿ڣ�ʹ��ServerSocket ����������
		ServerSocket server =new ServerSocket(9999);
		//TODO 2 ����ʽ�ȴ����� accept
		Socket client =server.accept();
		System.out.println("һ���ͻ��˽���������");
		
		//д������
		//������
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg =dis.readUTF();
		//�����
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("������-->"+msg);
		dos.flush();

		
	}

}
