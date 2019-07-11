package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:29
 * @Description : ����ģʽ �� ThreadLocal
 * �������� ThreadLocal�����ǿ���ʵ��˫�ؼ��ģʽ�ı��塣
 * ���ǽ��ٽ���Դ�ֲ߳̾��������嵽�������ǽ�˫�ؼ��ĵ�һ�������� if (instance == null)
 * ת��Ϊ �ֲ߳̾���Χ�ڵĲ��� ������� ThreadLocal Ҳֻ��������ʶ���ѣ�������ʶÿ���߳��Ƿ��ѷ��ʹ���
 * ������ʹ���������Ҫ��ͬ���飬�����������һ����Ч�ʡ�
 */
public class Singleton4 {

    // ThreadLocal �ֲ߳̾�����
    private static ThreadLocal<Singleton4> threadLocal = new ThreadLocal<Singleton4>();
    // ����Ҫ��
    private static Singleton4 singleton4 = null;

    private Singleton4(){}

    public static Singleton4 getSingleton4(){
        // ��һ�μ�飺���߳��Ƿ��һ�η���
        if (threadLocal.get() == null) {
            createSingleton4();
        }
        return singleton4;
    }

    public static void createSingleton4(){
        synchronized (Singleton4.class) {
            // �ڶ��μ�飺�õ����Ƿ񱻴���
            if (singleton4 == null) {
                // ִֻ��һ��
                singleton4 = new Singleton4();
            }
        }
        // ���������뵱ǰ�̵߳ľֲ�������
        threadLocal.set(singleton4);
    }
}
