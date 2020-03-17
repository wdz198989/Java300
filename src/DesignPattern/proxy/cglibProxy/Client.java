package DesignPattern.proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {

        TeacherDao target = new TeacherDao();

        // 此处需要强转，否则无法实现调用teach()方法
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayHello();
        proxyInstance.say("吴大忠");

    }
}
