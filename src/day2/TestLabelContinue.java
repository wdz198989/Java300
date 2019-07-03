package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 17:56
 * @Description : 带标签的continue
 */
public class TestLabelContinue {
    public static void main(String[] args) {
        //TODO 打印101到150之间的质数
        outer:for(int i =101;i<=150;i++){
            for(int j =2;j<i/2;j++){
               if(i%j==0){
                  continue  outer;
               }
            }
            System.out.println(i+"");
        }
    }
}
