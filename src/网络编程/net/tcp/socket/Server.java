package ������.net.tcp.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 ���������������� ������
1������������  ָ���˿�   ServerSocket(int port) 
2�����տͻ�������  
3����������+��������
* 
*/
public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//1������������  ָ���˿�   ServerSocket(int port) 
		ServerSocket server = new ServerSocket(8888);
		//2�����տͻ�������   ����ʽ
		Socket socket =server.accept();
		System.out.println("һ���ͻ��˽�������");
		//3����������
		String msg ="��ӭʹ��";
		//�����
		/*
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
				socket.getOutputStream()));
		
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		
		*/
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		
	}

}
