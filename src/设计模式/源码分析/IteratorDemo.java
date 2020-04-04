package 设计模式.源码分析;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 17:25
 * @Description :
 */
public class IteratorDemo {

    public static void main(String[] args) {
        List<String> a= new ArrayList<>();
        a.add("Jack");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
