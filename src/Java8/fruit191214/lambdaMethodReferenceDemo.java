package Java8.fruit191214;


import java.util.Arrays;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 23:36
 * @Description :
 */
public class lambdaMethodReferenceDemo {

    public static void main(String[] args) {
         String[] fruits={"apple","mango","banana","peach","orange"};
        FruitComparator fruitComparator = new FruitComparator();
        NonFunctionalFruitComparator nonFunctionalFruitComparator = new NonFunctionalFruitComparator();
        List<String> fruitsList=null;

        Arrays.sort(fruits,fruitComparator);
        fruitsList = Arrays.asList(fruits);
        System.out.println("java8 之前");
        fruitsList.forEach(s-> System.out.println(s));
        System.out.println();

        Arrays.sort(fruits,(s1,s2)->s1.compareToIgnoreCase(s2));
        fruitsList= Arrays.asList(fruits);
        System.out.println("java8 之后");
        fruitsList.forEach(s-> System.out.println(s));
        System.out.println();


        Arrays.sort(fruits,fruitComparator::compare);
        fruitsList= Arrays.asList(fruits);
        System.out.println("method ref use:");
        fruitsList.forEach(s-> System.out.println(s));

        Arrays.sort(fruits,nonFunctionalFruitComparator::compare2);
        fruitsList= Arrays.asList(fruits);
        System.out.println("method ref use:");
        fruitsList.forEach(s-> System.out.println(s));

    }
}
