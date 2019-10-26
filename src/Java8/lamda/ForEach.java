package Java8.lamda;


import java.util.Arrays;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:25
 * @Description : 利用lambda表达式对列表进行迭代
 * 以下是lambda表达式的重要特征:
 *
 *     可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 *     可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 *     可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 *     可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "c", "C++", "php", "c#");
        list.forEach(n -> System.out.println(n));
        list.forEach(System.out::println);
    }
}
