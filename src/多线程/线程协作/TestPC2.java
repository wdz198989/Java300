package ���߳�.�߳�Э��;


/**
 * @Author : WuDazhong
 * @Date :2020/8/16 21:19
 * @Description : ��������������������2���źŵƷ�����־λ���
 */
public class TestPC2 {

    public static void main(String[] args) {
        TV tv=new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}


//������--��Ա
class Player extends Thread{
    TV tv;

    public Player(TV tv){
       this.tv=tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(1%2==0){
               this.tv.play("���ִ�Ӫ������");
            }else{
                this.tv.play("��������¼��������");
            }
        }
    }
}

//������--����
class Watcher extends Thread{
    TV tv;

    public Watcher(TV tv){
        this.tv=tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}
//��Ʒ---��Ŀ
class TV{
    //��Ա���ݣ����ڵȴ�
    //���ڹۿ�����Ա�ȴ�
    String voice;//���ݵĽ�Ŀ
    boolean flag =true;
    //����

    public synchronized void play(String voice){
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("��Ա�����ˣ�"+voice);
        //֪ͨ���ڹۿ�
        this.notifyAll();
        this.voice=voice;
        this.flag=!this.flag;

    }
    //�ۿ�
    public synchronized void watch(){
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("���ڹۿ��ˣ�"+voice);
        //֪ͨ��Ա����
        this.notifyAll();
        this.flag=!this.flag;
    }
}
