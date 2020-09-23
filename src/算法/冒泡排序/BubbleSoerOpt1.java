package 算法.冒泡排序;


/**
 * @Author : WuDazhong
 * @Date :2020/9/23 14:54
 * @Description :
 */
/**
 * 算法的第一次优化#
 *
 * 　　经过了上述的讨论和编码，常规的冒泡排序已经被我们实现了。那么接下来我们要讨论的就是刚刚分析时候提出的问题。
 *
 * 　　首先针对第一个问题，当我们进行完第三遍的时候，实际上整个排序都已经完成了，但是常规版还是会继续排序。
 *
 * 　　可能在上面这个示例下，可能看不出来效果，但是当数组是，5，4，3，1，2 的时候的时候就非常明显了，实际上在第一次循环的时候整个数组就已经完成排序，但是常规版的算法仍然会继续后面的流程，这就是多余的了。
 *
 * 　　为了解决这个问题，我们可以设置一个标志位，用来表示当前第 i 趟是否有交换，如果有则要进行 i+1 趟，如果没有，则说明当前数组已经完成排序。实现代码如下：
 */
public class BubbleSoerOpt1 {
    public static void main(String[] args) {
        int[] list = {5,4,3,1,2};
        int temp = 0; // 开辟一个临时空间, 存放交换的中间值
        // 要遍历的次数
        for (int i = 0; i < list.length-1; i++) {
            int flag = 1; //设置一个标志位
            //依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = 0; j < list.length-1-i; j++) {
                // 比较相邻的元素，如果前面的数小于后面的数，交换
                if (list[j] < list[j+1]) {
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                    flag = 0;  //发生交换，标志位置0
                }
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