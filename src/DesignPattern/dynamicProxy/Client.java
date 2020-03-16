package DesignPattern.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象(***注意返回的是接口ITeacherDao而不是类TeacherDao)
        ITeacherDao target = new TeacherDao();
          // 给目标对象生成代理对象，并且强转成teacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance="+proxyInstance.getClass());
        //通过代理对象，调用目标方法
        proxyInstance.teach();
        proxyInstance.sayHello("吴大忠");

    }
}
