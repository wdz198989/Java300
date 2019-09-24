package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/31 0:05
 * @Description : 静态内部类---懒汉式
 */
public class SingletonTest {

    private static class SingletonHolder{
        private static  final SingletonTest INSTANCE= new SingletonTest();

    }
    private SingletonTest(){}
    public  static  final SingletonTest getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
