package Java8.�й��Java8.��pdfѧϰ;


import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 21:41
 * @Description :
 */
public class Test1 {

    @org.junit.Test
    public  void test1(){
        // �����ڲ���
        Runnable r1 =new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };
        r1.run();

        // lambda���ʽ
        Runnable r2=()-> System.out.println("Hello Lambda!");
        r2.run();
    }

    @Test
    public  void test2(){
        //ԭ��ʹ�������ڲ�����Ϊ��������
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(Integer.compare(o1.length(),o2.length()));
                return Integer.compare(o1.length(),o2.length());
            }
        });

        ts.comparator().compare("wudazhong","luhui");

        //lambda
        TreeSet<String> ts2 = new TreeSet<>(
                (o1,o2) ->Integer.compare(o1.length(),o2.length())

        );
        System.out.println(ts2.comparator().compare("wudazhong","luhui"));
    }


}
