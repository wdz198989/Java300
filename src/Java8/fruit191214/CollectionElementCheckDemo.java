package Java8.fruit191214;


import java.util.function.Predicate;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 9:06
 * @Description : �Լ���ִ����������Ŀͻ��˴���
 * �嵥2�еĴ��뽫������ӵ����ϣ�����ν�ʣ�����ν�ʴ��ݸ�����lambda���ʽ�ķ�����
 * ������ʾ�������ͨ��ִ���嵥2�е�CollectionElementCheckDemo��õġ�
 * Ҫ����������������ɿͻ��˴��봫�ݣ���ͨ���б��ÿ��Ԫ�ز�����Ԫ������Ӧ���б�ʵ�ִ���
 */
public class CollectionElementCheckDemo {


    public void evaluate(){
        Predicate<String> apples=(p)-> {
            //equalsIgnoreCase��equals������ǰ�߲����ִ�Сд������������
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
