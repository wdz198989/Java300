package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/31 0:05
 * @Description : ��̬�ڲ���---����ʽ
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
