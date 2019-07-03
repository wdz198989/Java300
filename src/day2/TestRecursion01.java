package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 20:00
 * @Description : 测试递归
 */
public class TestRecursion01 {
    public static void main(String[] args) {
        a();
    }

    static  int  count = 0;
    static  void  a(){
        System.out.println("a");
        count++;
        System.out.println(count);
        if(count<10){
            a();
        }else{
            return;
        }

    }

    static  void  b(){
        System.out.println("b");
    }


}