package summary.NIO.day2;


import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author : WuDazhong
 * @Date :2019/7/28 23:18
 * @Description :
 */
public class TestBlockingNIOWDZ {

    @Test
    public void client() throws IOException {
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8087));

        FileChannel inChannel = FileChannel.open(Paths.get("1.jpg"), StandardOpenOption.READ);

        ByteBuffer buf = ByteBuffer.allocate(1024);
        while (inChannel.read(buf) != -1) {
            buf.flip();
            sChannel.write(buf);
            buf.clear();

        }

        sChannel.shutdownOutput();
        //���ܻص�
       int  len = 0;
        while ((len =sChannel.read(buf))!=-1){
            buf.flip();
            System.out.println(new String(buf.array(),0,len));
            buf.clear();

        }

        inChannel.close();
        sChannel.close();

    }

    @Test
    public void server() throws IOException {

        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        FileChannel outChannel = FileChannel.open(Paths.get("2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        ssChannel.bind(new InetSocketAddress(8087));

        SocketChannel sChannel = ssChannel.accept();
        ByteBuffer buf = ByteBuffer.allocate(1024);

        while (sChannel.read(buf)!=-1){
            buf.flip();
            outChannel.write(buf);
            buf.clear();

        }

        //֪ͨ�ͻ���
        buf.put("���͵Ļ����Ѿ����յ���".getBytes());
        buf.flip();
        sChannel.write(buf);


        sChannel.close();
        outChannel.close();
        ssChannel.close();

    }


}
