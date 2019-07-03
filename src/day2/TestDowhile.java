package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 15:56
 * @Description : 测试
 */
public class TestDowhile {
    public static void main(String[] args) {
        int i =0;
        int sum = 0;

     do{
         sum +=i;
         i++;
       }while (i<=100);
        System.out.println(sum);
    }
}
