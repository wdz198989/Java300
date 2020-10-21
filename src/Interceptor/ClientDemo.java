package Interceptor;


/**
 * @Author : WuDazhong
 * @Date :2020/10/21 9:20
 * @Description : �ͻ���
 * �� 5 ���������ͻ��� ClientDemo
 */

/**   ͨ��javaʵ����������Ч��
 * ͨ����ƪ���£����ǿ��ܻ����������ʵ��ԭ����һ����͸������⡣
 * But������������Ŀʵ��֮�У�Ҫ��ʵ���������Ĺ��ܣ�����һ�����
 * �̳���HandlerInterceptorAdapter���߳�����AbstractInterceptor��
 * ����ʵ��HandleInterceptor�ӿڡ�Ҳ����˵������ֻ��Ҫ���������д������
 * ������Ҫ�������ڲ���ʵ��ԭ��
 */

public class ClientDemo {
    public static void main(String args[]) {
        // ������̬��������
        DynamicProxyHandler handler = new DynamicProxyHandler();

        // ����ҵ���������
        BusinessFacade business = new BusinessClass();

        // ����ҵ��������󣬲��ö�̬����󶨴�����
        BusinessFacade businessProxy = (BusinessFacade) handler.bind(business);

        // ����ҵ������еķ�������ʾ������Ч��
        businessProxy.doSomething();
    }
}
