package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 1:05
 * @Description : ����������߳����ֱ��ȡ������Ȼ���ӡ��������ȡ���ĵ�����hashCodeֵ��
 * �����ǻ�ȡ�ĵ�������ͬ��(�õ���ģʽ��ʵ�����̰߳�ȫ��)����ô���ǵ�hashCodeֵһ����ȫһ�£�
 * �����ǵ�hashCodeֵ����ȫһ�£���ô��ȡ�ĵ����ض�����ͬһ����
 * ���õ���ģʽ��ʵ�ֲ����̰߳�ȫ�ģ��Ƕ����ġ�
 */
public class Test {
    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TestThread();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }

}

class TestThread extends Thread {
    @Override
    public void run() {
        // ���ڲ�ͬ����ģʽ��ʵ�֣�ֻ�������Ӧ�ĵ����������乫�о�̬��������������
        int hash = Singleton3.getSingleton3().hashCode();
        System.out.println(hash);
    }
}
