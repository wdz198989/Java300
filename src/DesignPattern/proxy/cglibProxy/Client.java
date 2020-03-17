package DesignPattern.proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {

        TeacherDao target = new TeacherDao();

        // �˴���Ҫǿת�������޷�ʵ�ֵ���teach()����
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayHello();
        proxyInstance.say("�����");

    }
}
