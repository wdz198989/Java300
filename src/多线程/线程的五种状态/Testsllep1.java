package ���߳�.�̵߳�����״̬;


/**
 * @Author : WuDazhong
 * @Date :2020/8/12 21:55
 * @Description : ģ�⵹��ʱ
 */
public class Testsllep1 {


    public static void main(String[] args) {
        try {
            tenDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void tenDown() throws InterruptedException {
        int num =10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0){
                break;
            }
        }
    }
}
