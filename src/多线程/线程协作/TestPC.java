package ���߳�.�߳�Э��;


/**
 * @Author : WuDazhong
 * @Date :2020/8/16 21:38
 * @Description : ���������������ߣ�--���û�����-���̷ܳ�
 */
public class TestPC {

    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        new Productor(synContainer).start();

        new Consumer(synContainer).start();
    }
}
//������
class Productor extends Thread{
    SynContainer synContainer;
    public Productor(SynContainer synContainer){
        this.synContainer=synContainer;
    }
    //����
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            synContainer.push(new Chicken(i));
            System.out.println("������"+i+"ֻ��");
        }
    }
}

//������
class Consumer extends Thread{
    SynContainer synContainer;
    public Consumer(SynContainer synContainer){
        this.synContainer=synContainer;
    }
    //����
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("������"+synContainer.pop().id+"ֻ��");
        }
    }
}

//��Ʒ
class Chicken{
   int id;

    public Chicken(int id) {
        this.id = id;
    }
}

//������
class SynContainer{
    // ������С
    Chicken[] chickens=new Chicken[10];
    // ����������
    int count =0;

    //�����߷����Ʒ
    public synchronized void push(Chicken chicken){
        //����������ˣ�����Ҫ�ȴ�����������
        if(count==chickens.length){
            //֪ͨ���������ѣ������ȴ�
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        // ���û���������ǾͶ����Ʒ
        chickens[count]=chicken;
        count++;
        // ����֪ͨ����������
        this.notifyAll();

    }

    // ���������Ѳ�Ʒ
    public synchronized Chicken pop(){
        //�ж��ܷ�����
        if(count==0){
            //�ȴ������������������ߵȴ�
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //����ͻ�������
        count--;
        Chicken chicken=chickens[count];

        //�����ˣ�֪ͨ����������
        this.notifyAll();

        return chicken;

    }
}

