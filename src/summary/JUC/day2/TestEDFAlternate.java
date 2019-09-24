package summary.JUC.day2;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author : WuDazhong
 * @Date :2019/7/28 10:28
 * @Description : ≤‚ ‘ΩªÃÊ¥Ú”°
 */
public class TestEDFAlternate {

    public static void main(String[] args) {

        AlterDemo ad = new AlterDemo();

        new Thread(new Runnable() {
            @Override
            public void run() {
              for(int i =1 ;i <=20;i++){
                 ad.loopE(i);
              }
            }
        },"E").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1 ;i <=20;i++){
                    ad.loopD(i);
                }
            }
        },"D").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1 ;i <=20;i++){
                    ad.loopF(i);
                }
            }
        },"F").start();

    }
}

class AlterDemo{
    private int number =1;

    private Lock lock = new ReentrantLock();

    private Condition condition1= lock.newCondition();
    private Condition condition2= lock.newCondition();
    private Condition condition3= lock.newCondition();

    public  void loopE(int totalLoop){

        lock.lock();

        try {
            if(number!= 1 ){
                condition1.await();
            }


            for(int i =1 ;i<=1;i++){
               // System.out.println(Thread.currentThread().getName()+"\t"+i+"\t"+totalLoop);
                System.out.print(Thread.currentThread().getName());

            }

            number =2;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
    public  void loopD(int totalLoop){

        lock.lock();

        try {
            if(number!= 2 ){
                condition2.await();
            }


            for(int i =1 ;i<=1;i++){
                //System.out.println(Thread.currentThread().getName()+"\t"+i+"\t"+totalLoop);
                System.out.print(Thread.currentThread().getName());
            }

            number =3;
            condition3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public  void loopF(int totalLoop){

        lock.lock();

        try {
            if(number!= 3 ){
                condition3.await();
            }


            for(int i =1 ;i<=1;i++){
               // System.out.println(Thread.currentThread().getName()+"\t"+i+"\t"+totalLoop);
                System.out.print(Thread.currentThread().getName());
            }

            number =1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
