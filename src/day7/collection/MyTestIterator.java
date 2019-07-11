package day7.collection;


import java.util.*;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 11:59
 * @Description : 测试迭代器的使用
 */
public class MyTestIterator {
    public static void main(String[] args) {
        testIteratorList();
        testIteratorSet();
        testIteratorMap();
    }

    public static void testIteratorList(){
     List<String> list = new ArrayList<>();
     list.add("吴大忠");
     list.add("鲁慧");
     list.add("世界");
     for(Iterator<String> iter =list.iterator();iter.hasNext();){
         String temp= iter.next();
         System.out.println(temp);
     }
    }


    public static void testIteratorSet(){
     Set<String> set = new HashSet<>();
        set.add("吴大忠");
        set.add("鲁慧");
        set.add("世界");
        for(Iterator<String> iter =set.iterator();iter.hasNext();){
            String temp= iter.next();
            System.out.println(temp);
        }
    }

    private static  void testIteratorMap(){
      Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "aa");
        map1.put(200, "bb");
        map1.put(300, "cc");
        Set<Map.Entry<Integer, String>> ss = map1.entrySet();
        for(Iterator<Map.Entry<Integer,String>> iter =ss.iterator();iter.hasNext();){
            Map.Entry<Integer,String> temp = iter.next();
            System.out.println(temp);
        }

        Set<Integer>  keySet = map1.keySet();
        for(Iterator<Integer> iter=keySet.iterator();iter.hasNext(); ){
            Integer key = iter.next();
            System.out.println(key+"----"+map1.get(key));
        }

    }
}
