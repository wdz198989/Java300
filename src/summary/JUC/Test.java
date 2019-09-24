package summary.JUC;


/**
 * @Author : WuDazhong
 * @Date :2019/7/24 15:02
 * @Description : ≤‚ ‘
 */
public class Test {
    public static void main(String[] args) {
        int i=10;
        i= i++;
        System.out.println(i);
        int temp = i;
        i =i +1;
        i=temp;
        System.out.println(temp);
    }
}
