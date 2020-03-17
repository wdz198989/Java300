package DesignPattern.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象,同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();
        teacherDaoProxy.say();

    }
}
