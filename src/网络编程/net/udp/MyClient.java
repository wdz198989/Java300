package ������.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * �ͻ���
 * 1�������ͻ��� +�˿�
 * 2��׼������
 * 3����������͵ĵص� ���˿ڣ�
 * 4������
 * 5���ͷ�
 * 
 * ˼��: 89.12  ����+����
 * @author Administrator
 *
 */
public class MyClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1�������ͻ��� +�˿�
		DatagramSocket client = new DatagramSocket(6666);
		//2��׼������
		String msg ="udp���";
		byte[] data =msg.getBytes();
		//3����������͵ĵص� ���˿ڣ� DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
		//4������
		client.send(packet);
		//5���ͷ�
		client.close();
		
	}

}
