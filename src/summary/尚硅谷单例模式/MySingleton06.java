package summary.�й�ȵ���ģʽ;


/**
 * @Author : WuDazhong
 * @Date :2019/7/15 14:36
 * @Description : ��̬�ڲ��ഴ������
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
