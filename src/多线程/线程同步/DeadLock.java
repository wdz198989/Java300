package ���߳�.�߳�ͬ��;


/**
 * @Author : WuDazhong
 * @Date :2020/8/16 10:47
 * @Description : ����������̻߳��౧�ŶԷ�����Դ��Ȼ���γɽ���
 */
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1= new Makeup(0,"�ҹ���");
        Makeup g2= new Makeup(1,"��ѩ����");
        g1.start();
        g2.start();
    }
}



//�ں�
class Lipstick{

}
//����
class Mirror {

}

//��ױ

class Makeup extends Thread{
    //��Ҫ����Դֻ��һ�ݣ���static����ֻ֤��һ��
    static Lipstick lipstick=new Lipstick();
    static Mirror mirror=new Mirror();

    //ѡ��
    int choice;
    //ʹ�û�ױƷ����
    String girlName;
    Makeup(int choice,String girlName){
        this.choice=choice;
        this.girlName=girlName;

    }

    @Override
    public void run() {
      //��ױ

        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeup() throws InterruptedException {

        if(choice==0){
            synchronized (lipstick){//��ÿں����
                System.out.println(this.girlName+"�õ��˿ں�");
                Thread.sleep(1000);
                /*synchronized (mirror){
                    System.out.println(this.girlName+"�õ��˾���");
                }*/

            }
            synchronized (mirror){
                System.out.println(this.girlName+"�õ��˾���");
            }

        }else{
            synchronized (mirror){
                System.out.println(this.girlName+"�õ��˾���");
                Thread.sleep(2000);
                /*synchronized (lipstick){
                    System.out.println(this.girlName+"�õ��˿ں�");
                }*/

            }
            synchronized (lipstick){
                System.out.println(this.girlName+"�õ��˿ں�");
            }

        }
    }


}
