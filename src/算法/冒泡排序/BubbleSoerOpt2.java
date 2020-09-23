package 算法.冒泡排序;


/**
 * @Author : WuDazhong
 * @Date :2020/9/23 14:55
 * @Description :
 */
/**
 * 算法的第二次优化#
 *
 * 　　　除了上面这个问题，在冒泡排序中还有一个问题存在，就是第 i 趟排的第 i 小或者大的元素已经在第 i 位上了，甚至可能第 i-1 位也已经归位了，那么在内层循环的时候，有这种情况出现就会导致多余的比较出现。例如：6，4，7，5，1，3，2，当我们进行第一次排序的时候，结果为6，7，5，4，3，2，1，实际上后面有很多次交换比较都是多余的，因为没有产生交换操作。
 *
 * 　　我们用刚刚优化过一次的算法，跑一下这个数组。
 */
public class BubbleSoerOpt2 {
    public static void main(String[] args) {
        int[] list = {6,4,7,5,1,3,2};
        int len = list.length-1;
        int temp = 0; // 开辟一个临时空间, 存放交换的中间值
        // 要遍历的次数
        for (int i = 0; i < list.length-1; i++) {
            int flag = 1; //设置一个标志位
            //依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = 0; j < len-i; j++) {
                // 比较相邻的元素，如果前面的数小于后面的数，交换
                if (list[j] < list[j+1]) {
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                    flag = 0;  //发生交换，标志位置0

                }
                System.out.format("第 %d 遍第%d 趟结果：", i+1, j+1);
                for(int count:list) {
                    System.out.print(count);
                }
                System.out.println("");
            }

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
