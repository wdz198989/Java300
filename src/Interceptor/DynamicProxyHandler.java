package Interceptor;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author : WuDazhong
 * @Date :2020/10/21 9:18
 * @Description :  ��̬������������
 * �� 4 ����������̬������������ DynamicProxyHandler
 */
public class DynamicProxyHandler implements InvocationHandler {
    // �������������
    private Object business;

    // ����������
    private InterceptorClass interceptor = new InterceptorClass();

    /**
     ����* ��̬����һ����������󣬲��󶨱�������ʹ���������
     ����*
     ����* @param business
     ����* @return ���������
     ����*/
    public Object bind(Object business) {
        this.business = business;

        /**
         * Proxy.newProxyInstance(����1, ����2, ����3)
         *
         * ����1, ��ʾ��������� ClassLoader
         * ����2, ��ʾ������Ľӿ�
         * ����3, ��ʾ������������
         *
         * �÷��������ش���ʵ��
         */
        return Proxy.newProxyInstance(business.getClass().getClassLoader(),
                business.getClass().getInterfaces(),
                this);
    }

    /**
     ����* ������Ҫ���õķ��������ڸ÷�������ǰ���ȵ����������ķ�����
     ����*
     ����* @param proxy ���������
     ����* @param method ������Ľӿڷ���
     ����* @param args ������ӿڷ����Ĳ���
     ����* @return �������÷��صĽ��
     ����* @throws Throwable
     ����*/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        interceptor.before();
        result = method.invoke(business, args);
        interceptor.after();
        return null;
    }
}
