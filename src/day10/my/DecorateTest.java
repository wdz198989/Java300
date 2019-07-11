package day10.my;
/**
 * @Author : WuDazhong
 * @Date :2019/7/10 23:01
 * @Description :  * 模拟咖啡（装饰者模式）
 * 1、抽象组件:需要装饰的抽象对象(接口或抽象父类)
 * 2、具体组件:需要装饰的对象
 * 3、抽象装饰类:包含了对抽象组件的引用以及装饰着共有的方法
 * 4、具体装饰类:被装饰的对象
 */
public class DecorateTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Suger suger = new Suger(coffee);
        System.out.println(suger.info()+",价格为："+suger.cost());
        Drink milk =new Milk(coffee);
        System.out.println(milk.info()+",价格为："+milk.cost());
        milk = new Milk(suger);
        System.out.println(milk.info()+",价格为："+milk.cost());

    }
}
   //TODO  抽象组件
    interface Drink{
        //费用
        double cost();
        //说明
         String info();
   }

   //TODO 具体组件
    class  Coffee implements Drink{
       private String name ="原味咖啡";

       @Override
       public double cost() {
           return 10;
       }

       @Override
       public String info() {
           return name;
       }
   }
   //TODO 抽象装饰类
   abstract class Decorate implements Drink{
     //对抽象组件的引用
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

   //TODO 具体装饰类

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
            return super.info()+"加入了牛奶";
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
            return super.info()+"加入了蔗糖";
        }
    }


