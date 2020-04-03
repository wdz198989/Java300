package ���ģʽ.proxy.cglibProxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    //ά��һ��Ŀ�����
    private Object target;

    // ������������һ��������Ķ���
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //����һ�����������target�Ĵ������
    public Object getProxyInstance(){
        //1����һ��������
        Enhancer enhancer = new Enhancer();
        //2���ø���
        enhancer.setSuperclass(target.getClass());
        //3���ûص�����
        enhancer.setCallback(this);
        //4����������󣬼��������
        return  enhancer.create();
    }
    // ��дintecept�����������Ŀ�����ķ���
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib����ʼ");
        Object returnVal = method.invoke(target, args);
        System.out.println("cglib�������");

        return returnVal;
    }
}
