package ���߳�.�߳�ͬ��;


/**
 * @Author : WuDazhong
 * @Date :2020/8/15 23:15
 * @Description : ģ��������ȥ����ȡǮ
 */
public class UnsafeBank {
    public static void main(String[] args) {
        Account account=new Account(1000,"������");

        Drawing you = new Drawing(account,50,"�����");
        Drawing luhui = new Drawing(account,100,"³��");
        you.start();
        luhui.start();

    }


}


//�˻�
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}


//���У�ģ��ȡ��

class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int nowMoney;

  public Drawing(Account account,int drawingMoney,String name){
      super(name);
      this.drawingMoney=drawingMoney;
      this.account=account;
  }


    @Override
    public void run() {
      synchronized (account){
          //�ж���û��Ǯ
          if(account.money-drawingMoney<0){
              System.out.println(Thread.currentThread().getName()+"Ǯ������,ȡ����");
              return;
          }
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          // ����ʣ���Ǯ
          account.money=account.money-drawingMoney;
          //���ϵ�Ǯ
          nowMoney=nowMoney+drawingMoney;
          System.out.println(account.name+"���Ϊ��"+account.money);
          System.out.println(this.getName()+"���ϵ�ǮΪ��"+nowMoney);
      }

    }
}