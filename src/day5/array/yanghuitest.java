package day5.array;


/**
 * 〈打印直角杨辉三角形〉<br>
 *
 * @author hjsjy
 * @create 2018/9/13
 * @since 1.0.0
 */
public class yanghuitest {
    int[][] a;
    public int[][] yang(int n){
        a=new int[n][n];
        for(int i=0;i<n;i++){

            a[i][0]=1;
            a[i][i]=1;//第一行输出1，第二行输出1 1
            if(i>=2){//下面当行数大于2的时候开始计算第n行的第一位到最后一位之间的数据
                for(int j=1;j<i;j++) {
                    a[i][j] = a[i - 1][j] + a[i - 1][j - 1];/*这之间的每个
               数为上一行的同一列数和上遗憾的同一列数的前一列数之和，
               这样二维数据就完整的记录了杨辉三角形。*/
                }
            }
        }
        //下面是实现打印二维数组，即打印杨辉三角形
        for(int i=0;i<n;i++) {//打印n行
            for (int j = 0; j <= i; j++) {//打印每一行的里面的数据
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return a;
    }

    public static void main(String[] args) {
        new yanghuitest().yang(10);
    }
}
//输出结果
/*--------------------------
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1
        1 6 15 20 15 6 1
        1 7 21 35 35 21 7 1
        1 8 28 56 70 56 28 8 1
        1 9 36 84 126 126 84 36 9 1*/

