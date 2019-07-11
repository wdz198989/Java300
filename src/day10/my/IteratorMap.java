package day10.my;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 22:44
 * @Description : ����Map
 */
public class IteratorMap {

    public static void main(String[] args) {
       test();
    }

    public static void test(){
      Map<Integer, String> map= new HashMap<>();
      map.put(1,"�����");
      map.put(2,"³��");
        //TODO ����һ ����key ��ȡvalue
      Set<Integer> keyset = map.keySet();
      for(Integer key: keyset){
          System.out.println(map.get(key));
        }

        //TODO ������ ��ȡentrySet
        Set<Map.Entry<Integer, String>> ss = map.entrySet();
      for(Iterator iterator=ss.iterator();iterator.hasNext();){
          Map.Entry e =(Map.Entry) iterator.next();
          System.out.println(e.getKey()+"---"+e.getValue());
      }

    }



}
