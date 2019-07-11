package day10.my;


import java.io.*;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 17:59
 * @Description : д����
 */
public class MyIOTest02 {

    public static void main(String[] args) {
        // TODO 1����Դ
        File dest = new File("dest.txt");
        // TODO 2 ѡ����
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(dest,true);
            // TODO 3 ����
            String msg = " IO is so easy!!\r\n";
            byte[] datas = msg.getBytes();
            os.write(datas,0,datas.length);
            os.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            // TODO 4 �ر���
            try {
                if(null != os){
                    os.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
