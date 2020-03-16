package DesignPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//��̬����
public class ProxyFactory {
    // ά��һ��Ŀ�����
    private Object target;

    // ����������target���г�ʼ��
    public ProxyFactory(Object target) {
        this.target = target;
    }
     // ��Ŀ���������һ���������
    public  Object getProxyInstance(){
        // newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
        // ��������˵����
        //1 ClassLoader loader  ָ��ǰĿ�����ʹ�õ������������ȡ��������ķ����̶�
        //2 Class<?>[] interfaces Ŀ�����ʵ�ֵĽӿ����ͣ�ʹ�÷���ȷ������
        //3 InvocationHandler h  �¼�����ִ��Ŀ�����ķ���ʱ���ᴥ���¼�����������ѵ�ǰĿ�����ķ�����Ϊ��������

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk����ʼ");
                        //���÷������Ŀ�귽��
                        Object returnVal = method.invoke(target, args);
                        System.out.println("jdk�������");
                        return returnVal;
                    }
                });
    }
}
