package 构造方法测试;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : WuDazhong
 * @Date :2020/10/15 20:13
 * @Description : 1
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        hourMinuteBetween("2005-08-18 14:21:12", "2003-08-18 14:21:12", "2007-08-18 14:21:12.123");
    }


    public static boolean hourMinuteBetween(String nowDate, String startDate, String endDate) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date now = format.parse(nowDate);
        Date start = format.parse(startDate);
        Date end = format.parse(endDate);

        long nowTime = now.getTime();
        long startTime = start.getTime();
        long endTime = end.getTime();

        return nowTime >= startTime && nowTime <= endTime;

    }
}