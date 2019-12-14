package Java8.fruit191214;


import java.util.function.Predicate;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 9:06
 * @Description : 对集合执行所需操作的客户端代码
 * 清单2中的代码将数据添加到集合，定义谓词，并将谓词传递给接受lambda表达式的方法。
 * 下面显示的输出是通过执行清单2中的CollectionElementCheckDemo获得的。
 * 要评估和满足的条件由客户端代码传递，而通过列表的每个元素并评估元素由相应的列表实现处理
 */
public class CollectionElementCheckDemo {


    public void evaluate(){
        Predicate<String> apples=(p)-> {
            //equalsIgnoreCase与equals区别是前者不区分大小写，而后者区分
            return p.equalsIgnoreCase("apple");
        };


        FruitList fruits = new FruitList();
        fruits.addToBasket("apple");
        fruits.addToBasket("peach");
        fruits.addToBasket("orange");
        fruits.addToBasket("orange");
        fruits.addToBasket("pineapple");
        fruits.addToBasket("banana");
        boolean appleAvailable = fruits.fruitExists(apples);
        boolean allApples = fruits.sameFruits(apples);
        System.out.println("Apple in list?:"+appleAvailable);
        System.out.println("All same fruits?:"+allApples);
        System.out.println("\n");
        fruits.getFruits().clear();
        fruits.addToBasket("avocado");
        fruits.addToBasket("avocado");
        fruits.addToBasket("avocado");
        fruits.addToBasket("avocado");
        boolean avocadoAvailable = fruits.fruitExists(a -> a.equalsIgnoreCase("avocado"));
        boolean allAvocados = fruits.sameFruits(a -> a.equalsIgnoreCase("avocado"));
        System.out.println("Apple in list?:"+avocadoAvailable);
        System.out.println("All same fruits?:"+allAvocados);


    }

    public static void main(String...args) {
        CollectionElementCheckDemo demo = new CollectionElementCheckDemo();
        demo.evaluate();

    }



}
