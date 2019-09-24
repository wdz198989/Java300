package day5.array;


import java.util.Scanner;

/**
 * @Author : WuDazhong
 * @Date :2019/7/27 21:25
 * @Description : ���������գ��ж���һ���Ǹ���ĵڼ���
 */
public class Java05 {
    //���������գ��ж���һ���Ǹ���ĵڼ���
    public static void main(String[] args) {
        int year = 0;   //��
        int month = 0;  //��
        int day = 0;    //��
        int sum = 0;    //�ϼ�����
        int flg = 0;    //�ж�������ȷ���

        Scanner sc = new Scanner(System.in);
        //��ȡ�����������
        do {
            System.out.println("�������꣺");
            year = sc.nextInt();
            System.out.println("�������£�");
            month = sc.nextInt();
            System.out.println("�������գ�");
            day = sc.nextInt();

            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("��������ȷ������");
                flg = 1;
            }
        } while (flg == 1);
        sc.close();

        //ȡ�������ĺ�
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum+=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum+=30;
                    break;
                case 2:
                    //�����2��29�죬ƽ��28��
                    if (((year%4 == 0 && year%100 != 0) || year%400 == 0)) {
                        sum+=29;
                    }else{
                        sum+=28;
                    }
                default:
                    break;
            }
        }
        sum+=day;
        System.out.println(year+"��"+month+"��"+day+"��"+"�Ǹ����"+sum+"��");
    }
}