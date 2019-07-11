package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:16
 * @Description : ͬ���ӳټ��� �� ʹ���ڲ���ʵ���ӳټ���
 */
public class Singleton5 {

    /**
     * ������������ʾ�����ǿ���ʹ���ڲ���ʵ���̰߳�ȫ������ʽ������
     * ���ַ�ʽҲ��һ��Ч�ʱȽϸߵ�������������Ϊʲô���̰߳�ȫ�ģ�
     * �������� ��Ϊʲô˵����ʽ�������������̰߳�ȫ�ģ��� �����ƣ��˲�׸����
     */

    // ˽���ڲ��࣬������أ���ʱ���أ�Ҳ�����ӳټ���
    private static class Holder {
        private static Singleton5 singleton5 = new Singleton5();
    }

    private Singleton5() {

    }

    public static Singleton5 getSingleton5() {
        return Holder.singleton5;
    }
}
