package Java8.stream.mapToInt;


import java.util.Arrays;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2021/1/5 9:11
 * @Description :打印出能被3整除的
 */
public class MapToIntTest1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("3", "6", "8", "14", "15", "17");
        list.stream().mapToInt(num ->Integer.parseInt(num))
                .filter(num ->num%3==0).forEach(System.out::println);
    }
}
