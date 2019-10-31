package Java8.iteratorForList;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/10/31 22:58
 * @Description : Java8新特性之forEach+Lambda 表达式遍历Map和List
 */
public class Test {
   /* public static void main(String[] args) {
      //遍历Map
     //============Java8之前的方式==========
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
     //============forEach + Lambda表达式==========
        Map<String, Integer> items2 = new HashMap<>();
        items2.put("A", 10);
        items2.put("B", 20);
        items2.put("C", 30);
        items2.put("D", 40);
        items2.put("E", 50);
        items2.put("F", 60);
        items2.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        items2.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });

    }
*/
    public static void main(String[] args) {
        //二遍历List:
        // ============Java8之前的方式==========
        List<String> items3 = new ArrayList<>();
        items3.add("A");
        items3.add("B");
        items3.add("C");
        items3.add("D");
        items3.add("E");

        for(String item : items3){
            System.out.println(item);
        }
        //============forEach + Lambda表达式==========
        List<String> items4 = new ArrayList<>();
        items4.add("A");
        items4.add("B");
        items4.add("C");
        items4.add("D");
        items4.forEach(item->System.out.println(item));
        items4.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });

    }
}
