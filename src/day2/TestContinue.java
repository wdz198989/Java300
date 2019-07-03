package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 17:45
 * @Description : 测试continue
 */
public class TestContinue {
    public static void main(String[] args) {
        //TODO 把100到150之间不能被3整除的数输出，并且每5个换行
        int count = 0;
        for(int i = 100;i<=150;i++){
            if(i%3==0){
              continue;
            }
            System.out.print(i+"\t");
            count++;
            if(count%5==0){
                System.out.println();
            }
        }
    }
}
