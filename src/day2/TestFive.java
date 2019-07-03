package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 16:26
 * @Description : 输出1到1000能被5整除的数。每行5个
 */
public class TestFive {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                j++;
            }
            if (j == 5) {
                System.out.println();
                j = 0;
            }
        }

    }
}