package 多线程.线程同步;


/**
 * @Author : WuDazhong
 * @Date :2020/8/15 23:15
 * @Description : 模拟两个人去银行取钱
 */
public class UnsafeBank {
    public static void main(String[] args) {
        Account account=new Account(1000,"结婚基金");

        Drawing you = new Drawing(account,50,"吴大中");
        Drawing luhui = new Drawing(account,100,"鲁慧");
        you.start();
        luhui.start();

    }


}


//账户
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}


//银行：模拟取款

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
          //判断有没有钱
          if(account.money-drawingMoney<0){
              System.out.println(Thread.currentThread().getName()+"钱不够了,取不了");
              return;
          }
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          // 卡里剩余的钱
          account.money=account.money-drawingMoney;
          //手上的钱
          nowMoney=nowMoney+drawingMoney;
          System.out.println(account.name+"余额为："+account.money);
          System.out.println(this.getName()+"手上的钱为："+nowMoney);
      }

    }
}