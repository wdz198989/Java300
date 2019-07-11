package day10.my;


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 23:51
 * @Description : 打印流
 */
public class PrintTest {

    public static void main(String[] args) throws FileNotFoundException {


        PrintStream ps = System.out;
        ps.println("打印流");
        ps.println(true);
        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("1.txt")),true);
        ps.println("打印流");
        ps.println(true);
        ps.flush();

        // 重定向输出端
        System.setOut(ps);
        System.out.println("cahngge");

    }
}
