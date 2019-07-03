package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 15:48
 * @Description : 测试while循环
 */
public class TestWhile {
    public static void main(String[] args) {
        int i =0;
        int sum = 0;
        while(i<=100){
          sum =sum +i;
          i++;
        }
        System.out.println(sum);
    }
}
