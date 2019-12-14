package Java8.fruit;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 8:38
 * @Description : ˮ���嵥
 * ��Java 8��ʼ��Java֧�����ڴ�����Ԫ�ص������ܡ� Stream API��Java Collections Framework������¹��ܣ�����֧�ֺ�����lambda���ʽ�ĺ���ʽ��̷�� java.util.function�������˼�����ʹ�õļ������ܽӿڣ����Ժ����׵������ճ���̡��ڼ����ϻ�ȡ�ļ�����������ù����˽���lambda���ʽ�ԶԼ���ִ�в����ķ�����
 *
 * �����๫������removeIf��ν����������anyMatch��ν����������allMatch��ν��������֮��ķ������Լ�֧�ִ��������ݵ�lambda���ʽ������������
 *
 * ����Ĵ��루�嵥1��������FruitList�࣬���ڱ��漯�ϲ��Լ�����ִ�в�����
 */
public class FruitList {

    private List<String> fruits =null;

    public FruitList(){
        fruits=new ArrayList<>();
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }


     //���������ˮ��
    public void addToBasket(String fruit){
          fruits.add(fruit);
    }
   //Predicate ����ʽ�ӿڣ��Ƿ��������ˮ��
    public boolean fruitExists(Predicate<String> fruitExists){
        if(fruitExists==null){
              new NullPointerException("null predicate");
        }
        Stream<String> listStream = fruits.stream();
        //anyMatch��ʾ���жϵ����������һ��Ԫ�سɹ�������true
        boolean exists = listStream.anyMatch(fruitExists);
        return exists;

    }

    public boolean sameFruits(Predicate<String> sameFruits){
        if(sameFruits==null){
            new NullPointerException("null predicate");
        }
        Stream<String> listStream = fruits.stream();
        boolean allSame = listStream.anyMatch(sameFruits);
        return allSame;

    }

}
