package day10.my;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 16:32
 * @Description : IO����
 */
public class MyIOTest01 {
    public static void main(String[] args) {
        // TODO 1����Դ
        File file = new File("abc.txt");
        // TODO 2 ѡ����
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            // TODO 3 ����
          int temp;
          while ((temp=is.read())!=-1){
              System.out.print((char)temp);
          }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            // TODO 4 �ر���
            try {
                if(null != is){
                    is.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
