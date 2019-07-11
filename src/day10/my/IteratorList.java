package day10.my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 22:16
 * @Description : 遍历list的方法
 */
public class IteratorList {

    public static void main(String[] args) {
        test();
    }
    public  static void test(){
        List<String> list = new ArrayList<>();
        list.add("吴大忠");
        list.add("鲁慧");
        list.add("世界和平");

        //TODO 遍历list方法之一：普通for循环
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            System.out.println(temp);

        }
        System.out.println("###################################");

        //TODO 遍历list方法之二：增强for循环（使用泛型）
        for(String temp :list){
            System.out.println(temp);
        }
        System.out.println("###################################");

        //TODO 遍历list方法之三：使用iterator 迭代器1
        for(Iterator iter = list.iterator();iter.hasNext(); ){
           String  temp =(String)iter.next();
            System.out.println(temp);
        }
        System.out.println("###################################");

        //TODO 遍历list方法之四：使用iterator 迭代器2
       Iterator iter= list.iterator();
       while (iter.hasNext()){
           Object obj = iter.next();
           iter.remove();
           System.out.println("方法四："+obj);
       }
    }


}
