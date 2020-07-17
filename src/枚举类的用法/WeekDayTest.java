package 枚举类的用法;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 22:29
 * @Description : 11
 */
public class WeekDayTest {
    public static void getDay(WeekDay weekDay){
        switch (weekDay){
            case Monday:
                System.out.println("Today is Monday");
                break;
            case Tuesday:
                System.out.println("Today is Tuesday");
                break;
            case Wednesday:
                System.out.println("Today is Wednesday");
                break;
            case Thursday:
                System.out.println("Today is Thursday");
                break;
            case Friday:
                System.out.println("Today is Friday");
                break;
            case Saturday:
                System.out.println("Today is Saturday");
                break;
            case Sunday:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("data error");
        }
    }

    public static void main(String[] args) {
        WeekDay sunday = WeekDay.Sunday;
        getDay(sunday);
        WeekDay friday = WeekDay.Friday;
        getDay(friday);
    }
}
