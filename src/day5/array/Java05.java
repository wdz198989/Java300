package day5.array;


import java.util.Scanner;

/**
 * @Author : WuDazhong
 * @Date :2019/7/27 21:25
 * @Description : 输入年月日，判断这一天是该年的第几天
 */
public class Java05 {
    //输入年月日，判断这一天是该年的第几天
    public static void main(String[] args) {
        int year = 0;   //年
        int month = 0;  //月
        int day = 0;    //日
        int sum = 0;    //合计天数
        int flg = 0;    //判断输入正确与否

        Scanner sc = new Scanner(System.in);
        //读取输入的年月日
        do {
            System.out.println("请输入年：");
            year = sc.nextInt();
            System.out.println("请输入月：");
            month = sc.nextInt();
            System.out.println("请输入日：");
            day = sc.nextInt();

            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("请输入正确的日期");
                flg = 1;
            }
        } while (flg == 1);
        sc.close();

        //取得天数的和
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
                    //闰年的2月29天，平年28天
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
        System.out.println(year+"年"+month+"月"+day+"号"+"是该年的"+sum+"天");
    }
}