package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 16:13
 * @Description : 九九乘法表
 */
public class TestJiuJiu {
    public static void main(String[] args) {
        for(int j =1;j<=9;j++){
            for(int i = 1;i <=j;i++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
