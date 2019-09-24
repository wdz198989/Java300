package ������.net.tcp.MyTcp;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : ģ���½:��ͻ���
 */
public class LoginMultiClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �ͻ���---------");
        //TODO 1 �������ӣ�ʹ��socket�����ͻ���+ ����ĵ�ַ�Ͷ˿�
        Socket client = new Socket("localhost", 8888);
        //TODO 2 ������ �������������
        new Request(client).send();
        new Response(client).receive();
        //TODO 3 �ͷ���Դ
        client.close();

    }

    /**
     * �������� ������
     */
    static class Request{
        private Socket client;
        private DataOutputStream dos;
        private BufferedReader console;
        private String msg;

        public Request(Socket client) {
            console = new BufferedReader(new InputStreamReader(System.in));
            this.msg =init();
            this.client = client;
            try {

                 dos = new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         // todo ��ʼ��
        public String init(){
            try {
                System.out.println("�������û�����");
                String uname = console.readLine();
                System.out.println("���������룺");
                String upwd = console.readLine();
                return  "uname=" + uname + "&" + "upwd=" + upwd;
            } catch (IOException e) {
                e.printStackTrace();
            }
              return "";
        }

        public void send() {
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


    /**
     * �������ݣ���Ӧ��
     */
    static class Response{
        private Socket client;
        private DataInputStream dis;

        public Response(Socket client) {
            this.client = client;
            try {
                dis = new DataInputStream(client.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void receive() {
            String result;
            try {
                result = dis.readUTF();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
