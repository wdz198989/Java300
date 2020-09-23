package 算法.冒泡排序;


/**
 * @Author : WuDazhong
 * @Date :2020/9/23 14:57
 * @Description :
 */
/*　针对上述的问题，我们可以想到，利用一个标志位，记录一下当前第 i 趟所交换的最后一个位置的下标，在进行第 i+1 趟的时候，只需要内循环到这个下标的位置就可以了，因为后面位置上的元素在上一趟中没有换位，这一次也不可能会换位置了。基于这个原因，我们可以进一步优化我们的代码。
 */
public class BubbleSoerOpt3 {

        public static void main(String[] args) {
            int[] list = {6,4,7,5,1,3,2};
            int len = list.length-1;
            int temp = 0; // 开辟一个临时空间, 存放交换的中间值
            int tempPostion = 0;  // 记录最后一次交换的位置
            // 要遍历的次数
            for (int i = 0; i < list.length-1; i++) {
                int flag = 1; //设置一个标志位
                //依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
                for (int j = 0; j < len; j++) {
                    // 比较相邻的元素，如果前面的数小于后面的数，交换
                    if (list[j] < list[j+1]) {
                        temp = list[j+1];
                        list[j+1] = list[j];
                        list[j] = temp;
                        flag = 0;  //发生交换，标志位置0
                        tempPostion = j;  //记录交换的位置
                    }
                    System.out.format("第 %d 遍第%d 趟结果：", i+1, j+1);
                    for(int count:list) {
                        System.out.print(count);
                    }
                    System.out.println("");
                }
                len = tempPostion; //把最后一次交换的位置给len，来缩减内循环的次数
                System.out.format("第 %d 遍最终结果：", i+1);
                for(int count:list) {
                    System.out.print(count);
                }
                System.out.println("");
                if (flag == 1) {//如果没有交换过元素，则已经有序
                    return;
                }

            }
        }

}
