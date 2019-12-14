package Java8.fruit191214;


import java.util.function.Predicate;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 22:33
 * @Description : ����Ĵ��루�嵥3���еĿͻ��˴�����ʾ��ʹ��lambda���ʽ�Ӽ�����ɾ��Ԫ�صĴ���ʵ�֡�
 * ɾ����ʹ��Stream API��forEach������ӡ�������ݡ� Ϊ�˴�ӡ���ϵ�ÿ��Ԫ�أ�
 * ����ʹ��java.util.function.Consumer���ܽӿڡ�
 * ʹ��Consumer API�����lambda���ʽ�����ȡ��ÿ��Ԫ�صļ������ݵ����ã�
 * ������ǿ��ԶԼ�������ִ������Ĳ����� Predicate API�����������������ʽ�����ز������
 */
public class CollectionElementRemovalDemo {
    public void evaluate() {
        //���Լ������Ƿ���apple
        Predicate<String> exists = (p) -> {
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
        //�ж��Ƿ��з��϶����е�����������У�����true,����ɾ��
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