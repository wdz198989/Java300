package DesignPattern.proxy.staticProxy;
//代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao{

    private  ITeacherDao target;// 目标对象，通过接口来进行代理

    // 构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");

        target.teach();

        System.out.println("代理结束");
    }

    @Override
    public void say() {
        System.out.println("代理开始");

        target.say();

        System.out.println("代理结束");
    }
}
