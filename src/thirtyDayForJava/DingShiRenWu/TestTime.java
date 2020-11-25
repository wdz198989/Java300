package thirtyDayForJava.DingShiRenWu;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : WuDazhong
 * @Date :2020/11/2 20:15
 * @Description :
 */
public class TestTime {
    public static void main(String[] args) {
        //String res;
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long("1535359773000");
        Date date = new Date(lt);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sd.format(date));
        //res = simpleDateFormat.format(date);
    }


}
