package day5.array;


import java.util.Arrays;

/**
 * @Author : WuDazhong
 * @Date :2019/7/5 23:50
 * @Description : �ҵ�ð���������
 */
public class MyTestBubble {
    public static void main(String[] args) {

        int[] values = {3,1,6,2,9,0,7,4,5,8};
        int temp=0;
        for(int i =0 ;i<values.length-1;i++){
            boolean flag = true;
            System.out.println("��"+(i+1)+"�αȽϿ�ʼ");
            for (int j = 0; j < values.length-1-i; j++) {
                if(values[j]>values[j+1]){
                    temp = values[j];
                    values[j]=values[j+1];
                    values[j+1]=temp;
                    flag =false;
                }
                System.out.println(Arrays.toString(values));
            }
            if(flag){
                System.out.println("�ȽϽ���");
              break;
            }
            System.out.println("��"+(i+1)+"�αȽϽ���");
        }


    }
}
