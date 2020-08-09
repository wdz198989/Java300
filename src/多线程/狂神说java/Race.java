package ���߳�.����˵java;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 18:46
 * @Description : ģ���������
 */
public class Race  implements Runnable{
    //ʤ����
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            //ģ��������Ϣ
            if(Thread.currentThread().getName().equals("����")&&i%10==0){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            //�жϱ����Ƿ����
            boolean flag=gameOver(i);
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"---> ����"+i+"��");
            
        }
    }
    //�ж��Ƿ���ɱ���
    private boolean gameOver(int steps){
        if(winner!=null){
            return true;
        }else{
            if(steps>=100){
               winner=Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"����").start();
        new Thread(race,"³��").start();
    }

}
