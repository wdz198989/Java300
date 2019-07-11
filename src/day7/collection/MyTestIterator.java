package day7.collection;


import java.util.*;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 11:59
 * @Description : ���Ե�������ʹ��
 */
public class MyTestIterator {
    public static void main(String[] args) {
        testIteratorList();
        testIteratorSet();
        testIteratorMap();
    }

    public static void testIteratorList(){
     List<String> list = new ArrayList<>();
     list.add("�����");
     list.add("³��");
     list.add("����");
     for(Iterator<String> iter =list.iterator();iter.hasNext();){
         String temp= iter.next();
         System.out.println(temp);
     }
    }


    public static void testIteratorSet(){
     Set<String> set = new HashSet<>();
        set.add("�����");
        set.add("³��");
        set.add("����");
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
