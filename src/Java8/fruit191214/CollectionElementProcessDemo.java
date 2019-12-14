package Java8.fruit191214;


import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 22:59
 * @Description : 下面的代码（清单4）中的代码演示了java.util.functional.Consumer接口的另一种用法，
 * 即lambda表达式。 定义的表达式会评估每个元素以检查特定的国家/地区类型，
 * 然后使用适当的国家/地区特定问候语。
 * 此实现显示Consumer API可用于复杂操作，而不仅仅是将元素打印到输出控制台。
 */
public class CollectionElementProcessDemo {

    public  void evaluate(){
        Consumer<String> listEntries=(l) ->{

            System.out.println("processing:"+l);
            switch (l){
                case "USA":
                    System.out.println("Hello"+l);
                    break;
                case "Spain":
                    System.out.println("hola"+l);
                    break;
                case "France":
                    System.out.println("Bonjour"+l);
                    break;
                case "India":
                    System.out.println("Namaste"+l);
                    break;
                case "China":
                    System.out.println("你好"+l);
                    break;
            }

        };


        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("USA");
        countryList.add("Thailand");
        countryList.add("France");
        countryList.add("Spain");
        countryList.add("China");
        countryList.add("abc");
        System.out.println("\n");
        countryList.stream().forEach(listEntries);


    }


    public static void main(String... args) {
        CollectionElementProcessDemo demo = new CollectionElementProcessDemo();
        demo.evaluate();
    }


}
