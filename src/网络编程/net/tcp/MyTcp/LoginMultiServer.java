package ������.net.tcp.MyTcp;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 13:30
 * @Description : ģ���½: ��ͻ���
 */
public class LoginMultiServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- �����---------");
        //TODO 1 ָ���˿ڣ�ʹ��ServerSocket ����������
        ServerSocket server = new ServerSocket(8888);
        boolean isRunning = true;
        //TODO 2 ����ʽ�ȴ����� accept
        while (isRunning) {
            Socket client = server.accept();
            System.out.println("һ���ͻ��˽��������ӡ���������������������������");
            new Thread(new Channel(client)).start();

        }
           server.close();
    }


    /**
     * //TODO һ��channel�൱��һ���ͻ���
     */
    static class Channel implements Runnable{
        private Socket client;
        //������
        private DataInputStream dis;
        // �����
        private  DataOutputStream dos;
        public Channel(Socket client) {
            this.client = client;
            try {
                //����
                dis = new DataInputStream(client.getInputStream());
                // ���
                dos = new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
                release();

            }
        }

        @Override
        public void run() {
            //TODO 3 ����;:����������
            String uname = "";
            String upwd = "";
            //TODO ��������
            String[] dataArray = receive().split("&");
            for (String info : dataArray) {
                String[] userInfo = info.split("=");
                if (userInfo[0].equals("uname")) {
                    System.out.println("����û���Ϊ��" + userInfo[1]);
                    uname = userInfo[1];
                } else if (userInfo[0].equals("upwd")) {
                    System.out.println("�������Ϊ��" + userInfo[1]);
                    upwd = userInfo[1];
                }

            }

            if (uname.equals("wudazhong") && upwd.equals("123456")) {
                send("��½�ɹ�����ӭ����");
            } else {
                send("��½ʧ��");
            }
            //TODO 4 �ͷ���Դ
            release();


        }
        //TODO ��������
        private String receive(){
            String datas = "";
            try {
                datas = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return datas;
        }

        //TODO ���͵�¼���֪ͨ
        private void send (String msg){
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //TODO  �ͷ���Դ
        private void release(){

            try {
                if(null!=dos){
                    dos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(null!=dis){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(null!=client){
                client.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
