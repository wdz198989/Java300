package thirtyDayForJava.OptionTalTest;


/**
 * @Author : WuDazhong
 * @Date :2020/10/2 9:40
 * @Description :
 */
public class Boy {

    private Girl girl;

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public Boy() {

    }

    public Boy(Girl girl) {

        this.girl = girl;
    }


}
