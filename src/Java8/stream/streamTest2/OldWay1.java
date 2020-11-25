package Java8.stream.streamTest2;


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : WuDazhong
 * @Date :2020/11/25 11:38
 * @Description : 老的方式
 */
public class OldWay1 {
    public static void main(String[] args) {
        User zhangsan = new User(1,"张三",2,1);
        User lisi = new User(2,"李四",200,200);

        List<User> list=new ArrayList<>();
        list.add(zhangsan);
        list.add(lisi);
        Map<String ,List<User>> map = new HashMap<>();

        list.forEach(user->{
            String name = user.getName();
            List<User> users = map.get(name);
            if(CollectionUtils.isEmpty(users)){
                users=new ArrayList<>();
            }
            users.add(user);
            map.put(name,users);
        });
        System.out.println(map);
    }
}
