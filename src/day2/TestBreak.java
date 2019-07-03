package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 17:37
 * @Description : 测试Break
 */
public class TestBreak {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("开始");
        while(true){
            total++;
            int i = (int) Math.round(100 * Math.random());
            System.out.println(i);
            if(i==88){
               break;
            }
        }
        System.out.println("Game over,used:"+total+"times");
    }
}
