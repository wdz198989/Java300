package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:20
 * @Description : ����ģʽ��˫�ؼ��(Double-Check idiom):
 * ʹ��˫�ؼ��ͬ���ӳټ���ȥ����������������һ���ǳ������������
 * �䲻����֤�˵�����������ʵ����˳�������Ч�ʡ�
 */
public class Singleton3 {

    //ʹ��volatile�ؼ��ַ�ֹ��������Ϊ new Instance()��һ����ԭ�Ӳ��������ܴ���һ����������ʵ��
    private static volatile Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getSingleton3() {
        // Double-Check idiom
        if (singleton3 == null) {
            synchronized (Singleton3.class) {       // 1
                // ֻ���ڵ�һ�δ���ʵ��ʱ��ͬ��
                if (singleton3 == null) {       // 2
                    singleton3 = new Singleton3();      // 3
                }
            }
        }
        return singleton3;
    }



/*��������������ʾ��Ϊ���ڱ�֤������ǰ�����������Ч�ʣ�������Ҫ�� singleton3
    ���еڶ��μ�飬Ŀ���Ǳܿ������ͬ������Ϊ�����ͬ��ֻ���ڵ�һ�δ���ʵ��ʱ��ͬ����
    һ�������ɹ����Ժ��ȡʵ��ʱ�Ͳ���Ҫͬ����ȡ���ˣ���������������������ģ��������Ǳ���ע��һ�㣺
            ����
            ��������ʹ��volatile�ؼ������ε������á�*/
}
