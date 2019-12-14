package Java8.fruit;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 8:38
 * @Description : 水果清单
 * 从Java 8开始，Java支持用于处理集合元素的流功能。 Stream API是Java Collections Framework引入的新功能，用于支持和利用lambda表达式的函数式编程风格。 java.util.function包定义了集合类使用的几个功能接口，可以很容易地用于日常编程。在集合上获取的集合类和流引用公开了接受lambda表达式以对集合执行操作的方法。
 *
 * 集合类公开诸如removeIf（谓词条件），anyMatch（谓词条件），allMatch（谓词条件）之类的方法，以及支持处理集合数据的lambda表达式的其他方法。
 *
 * 下面的代码（清单1）定义了FruitList类，用于保存集合并对集合类执行操作。
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


     //向篮子里加水果
    public void addToBasket(String fruit){
          fruits.add(fruit);
    }
   //Predicate 断言式接口，是否存在这种水果
    public boolean fruitExists(Predicate<String> fruitExists){
        if(fruitExists==null){
              new NullPointerException("null predicate");
        }
        Stream<String> listStream = fruits.stream();
        //anyMatch表示，判断的条件里，任意一个元素成功，返回true
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
