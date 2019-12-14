package Java8.fruit191214;


import java.util.function.Predicate;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 22:33
 * @Description : 下面的代码（清单3）中的客户端代码演示了使用lambda表达式从集合中删除元素的代码实现。
 * 删除后，使用Stream API的forEach方法打印集合数据。 为了打印集合的每个元素，
 * 我们使用java.util.function.Consumer功能接口。
 * 使用Consumer API定义的lambda表达式逐个获取对每个元素的集合数据的引用，
 * 因此我们可以对集合数据执行所需的操作。 Predicate API有助于评估条件表达式并返回布尔结果
 */
public class CollectionElementRemovalDemo {
    public void evaluate() {
        //断言集合中是否有apple
        Predicate<String> exists = (p) -> {
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
        //判断是否有符合断言中的条件，如果有：返回true,并且删除
        boolean remove = fruits.getFruits().removeIf(exists);
        System.out.println("Apple removed from list?:"+remove);
        System.out.println("\n");
        fruits.getFruits().forEach(c-> System.out.println(c));
    }

    public static void main(String[] args) {
        CollectionElementRemovalDemo demo = new CollectionElementRemovalDemo();
        demo.evaluate();
    }


}