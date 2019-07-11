package ������.net.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * �ͻ���
 * 1�������ͻ��� +�˿�
 * 2��׼������   double -->�ֽ�����   �ֽ����������
 * 3����������͵ĵص� ���˿ڣ�
 * 4������
 * 5���ͷ�
 * 
 * 
 * @author Administrator
 *
 */
public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1�������ͻ��� +�˿�
		DatagramSocket client = new DatagramSocket(6666);
		//2��׼������
		double num =89.12;
		byte[] data =convert(num);
		//3����������͵ĵص� ���˿ڣ� DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
		//4������
		client.send(packet);
		//5���ͷ�
		client.close();
		
	}
	
	/**
	 * �ֽ����� ����Դ  +Data �����
	 * @param num
	 * @return
	 * @throws IOException 
	 */
	public static byte[] convert(double num) throws IOException{
		byte[] data =null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos =new DataOutputStream(bos);
		dos.writeDouble(num);
		dos.flush();
		
		//��ȡ����
		data = bos.toByteArray();
		dos.close();		
		return data;
		
	}
}
