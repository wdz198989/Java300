package Java8.stream.streamTest2;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author : WuDazhong
 * @Date :2020/11/25 11:54
 * @Description : �µķ�ʽ
 */
public class NewWay {
    public static void main(String[] args) {
        User zhangsan = new User(1,"����",2,1);
        User lisi = new User(2,"����",200,200);

        List<User> list=new ArrayList<>();
        list.add(zhangsan);
        list.add(lisi);
        Map<String, List<User>> map = list.stream().collect(Collectors.groupingBy(User::getName));
        System.out.println(map);
    }
}
