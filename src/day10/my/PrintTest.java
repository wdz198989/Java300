package day10.my;


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 23:51
 * @Description : ��ӡ��
 */
public class PrintTest {

    public static void main(String[] args) throws FileNotFoundException {


        PrintStream ps = System.out;
        ps.println("��ӡ��");
        ps.println(true);
        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("1.txt")),true);
        ps.println("��ӡ��");
        ps.println(true);
        ps.flush();

        // �ض��������
        System.setOut(ps);
        System.out.println("cahngge");

    }
}
