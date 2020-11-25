package map.MultiValueMap;


import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/11/25 14:09
 * @Description : 如果需要构建Map<K,List>结构，推荐使用MultiValueMap去操作
 */
public class MultiValueMapTest {
    public static void main(String[] args) {
        User zhangsan = new User(1,"张三",2,1);
        User lisi = new User(2,"李四",200,200);

        List<User> list=new ArrayList<>();
        List<User> list2= new ArrayList<>();
        list.add(zhangsan);
        list2.add(lisi);

       MultiValueMap<String, List<User>> map = new LinkedMultiValueMap<>();
       map.add(zhangsan.getName(),list);
       map.add(lisi.getName(),list2);
       List<List<User>> lists = map.get(zhangsan.getName());
        System.out.println(lists);

    }

}
