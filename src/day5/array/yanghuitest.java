package day5.array;


/**
 * ����ӡֱ����������Ρ�<br>
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
            a[i][i]=1;//��һ�����1���ڶ������1 1
            if(i>=2){//���浱��������2��ʱ��ʼ�����n�еĵ�һλ�����һλ֮�������
                for(int j=1;j<i;j++) {
                    a[i][j] = a[i - 1][j] + a[i - 1][j - 1];/*��֮���ÿ��
               ��Ϊ��һ�е�ͬһ���������ź���ͬһ������ǰһ����֮�ͣ�
               ������ά���ݾ������ļ�¼����������Ρ�*/
                }
            }
        }
        //������ʵ�ִ�ӡ��ά���飬����ӡ���������
        for(int i=0;i<n;i++) {//��ӡn��
            for (int j = 0; j <= i; j++) {//��ӡÿһ�е����������
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
//������
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

