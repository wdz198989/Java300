package thirtyDayForJava.sanyuanbiaodashi;


/**
 * @Author : WuDazhong
 * @Date :2020/10/22 16:51
 * @Description :  测试三元表达式
 */
public class test {

    public static void main(String[] args) {
        int a =5;
        int b =4;
        String c =null;
        c=a<b?"wudazhong":(a==b?"luhui":"bendan");
        System.out.println(c);
    }
}
