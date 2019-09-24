package day5.array;


import java.util.Arrays;

/**
 * @Author : WuDazhong
 * @Date :2019/7/27 20:35
 * @Description : ≤‚ ‘√∞≈›≈≈–Ú
 */
public class TestBubbleSort2 {
    public static void main(String[] args) {
        int[] values = {5,6,9,0,7,5,3,2,4,65,8};

        int temp = 0;
        for(int i =0;i<values.length-1;i++){
        boolean flag =true;
           for(int j =0;j<values.length-1-i;j++){
               if(values[j]>values[j+1]){
                   temp=values[j];
                   values[j]=values[j+1];
                   values[j+1]=temp;
                   flag=false;
                   System.out.println(Arrays.toString(values));

               }

           }
           if (flag){
               System.out.println("±È¿˙Ω· ¯");
               break;
           }

            System.out.println("########");
        }
    }
}
