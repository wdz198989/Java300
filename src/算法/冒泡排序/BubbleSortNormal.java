package 算法.冒泡排序;


/**
 * @Author : WuDazhong
 * @Date :2020/9/23 14:49
 * @Description :
 */
/**
 * 冒泡排序常规版-代码实现#
 *
 * 　　下面详细分析一下常规版的冒泡排序，整个算法流程其实就是上面实例所分析的过程。可以看出，我们在进行每一次大循环的时候，还要进行一个小循环来遍历相邻元素并交换。所以我们的代码中首先要有两层循环。
 *
 * 　　外层循环：即主循环，需要辅助我们找到当前第 i 小的元素来让它归位。所以我们会一直遍历 n-2 次，这样可以保证前 n-1 个元素都在正确的位置上，那么最后一个也可以落在正确的位置上了。
 *
 * 　　内层循环：即副循环，需要辅助我们进行相邻元素之间的比较和换位，把大的或者小的浮到水面上。所以我们会一直遍历 n-1-i 次这样可以保证没有归位的尽量归位，而归位的就不用再比较了。
 *
 * 　　而上面的问题，出现的原因也来源于这两次无脑的循环，正是因为循环不顾一切的向下执行，所以会导致在一些特殊情况下得多余。例如 5，4，3，1，2 的情况下，常规版会进行四次循环，但实际上第一次就已经完成排序了。
 */
public class BubbleSortNormal {
    public static void main(String[] args) {
        int[] list = {3,4,1,5,2};
        int temp = 0; // 开辟一个临时空间, 存放交换的中间值
        // 要遍历的次数
        for (int i = 0; i < list.length-1; i++) {
            System.out.format("第 %d 遍：\n", i+1);
            //依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = 0; j < list.length-1-i; j++) {
                // 比较相邻的元素，如果前面的数小于后面的数，就交换
                if (list[j] < list[j+1]) {
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                }
                System.out.format("第 %d 遍的第%d 次交换：", i+1,j+1);
                for(int count:list) {
                    System.out.print(count);
                }
                System.out.println("");
            }
            System.out.format("第 %d 遍最终结果：", i+1);
            for(int count:list) {
                System.out.print(count);
            }
            System.out.println("\n#########################");
        }
    }
}