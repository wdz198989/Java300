package ������.net.ip;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * ��װ�˿�:��InetAddress������+�˿�
 * @author Administrator
 *
 */
public class InetSockeDemo01 {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		InetSocketAddress  address = new InetSocketAddress("127.0.0.1",9999);
		address = new InetSocketAddress(InetAddress.getByName("127.0.0.1"),9999);
		System.out.println(address.getHostName());
		System.out.println(address.getPort());
		InetAddress addr =address.getAddress();
		System.out.println(addr.getHostAddress());
		//���أ���ַ
		System.out.println(addr.getHostName());
		//����������
		
	}

}
