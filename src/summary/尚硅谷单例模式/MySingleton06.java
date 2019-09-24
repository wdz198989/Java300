package summary.尚硅谷单例模式;


/**
 * @Author : WuDazhong
 * @Date :2019/7/15 14:36
 * @Description : 静态内部类创建单例
 */
public class MySingleton06 {


    private MySingleton06(){

    }

    private static class Inner{
        private static final MySingleton06 INSTANCE= new MySingleton06();

    }

    public static MySingleton06 getInstance(){
        return Inner.INSTANCE;
    }
}
