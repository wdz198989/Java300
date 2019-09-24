package ������.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * �����
 * 1����������� +�˿�
 * 2��׼����������
 * 3����װ�� ��
 * 4����������
 * 5����������  
 * 6���ͷ�
 * @author Administrator
 *
 */
public class MyServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("���շ��������С�����������������������������������������");
		//1����������� +�˿�
		DatagramSocket server = new DatagramSocket(8899);
		//2��׼����������
		byte[] container = new byte[1024];
		//3����װ�� �� DatagramPacket(byte[] buf, int length) 		
		DatagramPacket packet =new DatagramPacket(container, container.length) ;
		//4����������
		server.receive(packet);
		//5����������
		byte[] data =packet.getData();
		int len =packet.getLength();
		System.out.println(new String(data,0,len));
		//6���ͷ�
		server.close();
		
	}

}
