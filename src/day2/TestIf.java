package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 15:16
 * @Description : 测试if单选择结构
 */
public class TestIf {

    public static void main(String[] args) {
        int i = (int)(6*Math.random()+1);
        int j= (int)(6*Math.random()+1);
        int k = (int)(6*Math.random()+1);
        int count = i+j+k;
        System.out.print("今天得了："+count+"分，");
        if(count >15){
            System.out.println("手气很好");
        }
        if(count>=10 &&count<= 15){
            System.out.println("手气一般");
        }
        if(count<10){
            System.out.println("手气不怎么样");
        }

    }

    public void method(){
        

    }
}
