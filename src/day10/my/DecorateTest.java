package day10.my;
/**
 * @Author : WuDazhong
 * @Date :2019/7/10 23:01
 * @Description :  * ģ�⿧�ȣ�װ����ģʽ��
 * 1���������:��Ҫװ�εĳ������(�ӿڻ������)
 * 2���������:��Ҫװ�εĶ���
 * 3������װ����:�����˶Գ�������������Լ�װ���Ź��еķ���
 * 4������װ����:��װ�εĶ���
 */
public class DecorateTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Suger suger = new Suger(coffee);
        System.out.println(suger.info()+",�۸�Ϊ��"+suger.cost());
        Drink milk =new Milk(coffee);
        System.out.println(milk.info()+",�۸�Ϊ��"+milk.cost());
        milk = new Milk(suger);
        System.out.println(milk.info()+",�۸�Ϊ��"+milk.cost());

    }
}
   //TODO  �������
    interface Drink{
        //����
        double cost();
        //˵��
         String info();
   }

   //TODO �������
    class  Coffee implements Drink{
       private String name ="ԭζ����";

       @Override
       public double cost() {
           return 10;
       }

       @Override
       public String info() {
           return name;
       }
   }
   //TODO ����װ����
   abstract class Decorate implements Drink{
     //�Գ������������
       private Drink drink;
       public Decorate(Drink drink){
           this.drink=drink;
       }
       @Override
       public double cost() {
           return this.drink.cost();
       }

       @Override
       public String info() {
           return this.drink.info();
       }
   }

   //TODO ����װ����

    class Milk extends Decorate{

        public Milk(Drink drink) {
            super(drink);
        }

        @Override
        public double cost() {
            return super.cost()*4;
        }

        @Override
        public String info() {
            return super.info()+"������ţ��";
        }
    }

    class Suger extends Decorate{

        public Suger(Drink drink) {
            super(drink);
        }

        @Override
        public double cost() {
            return super.cost()*2;
        }

        @Override
        public String info() {
            return super.info()+"����������";
        }
    }


