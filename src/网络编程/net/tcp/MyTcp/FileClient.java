package 网络编程.net.tcp.MyTcp;


import java.io.*;
import java.net.Socket;

/**
 * @Author : WuDazhong
 * @Date :2019/7/12 14:01
 * @Description : 客户端：上传文件
 */
public class FileClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------- 客户端---------");
        //TODO 1 建立连接：使用socket创建客户端+ 服务的地址和端口
        Socket client = new Socket("localhost",8888);
        //TODO 2 操作：文件拷贝 上传
        InputStream is = new BufferedInputStream(new FileInputStream("src/1.jpg"));
        OutputStream os = new BufferedOutputStream(client.getOutputStream());
        byte[] flush = new byte[1024];
        int len =-1;
        while ((len=is.read(flush))!=-1){
               os.write(flush,0,len);
        }
         os.flush();
        //TODO 3 释放资源
        os.close();
        is.close();
        client.close();

    }
}
