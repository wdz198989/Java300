package DesignPattern.proxy.staticProxy;

public class TeacherDao  implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课...........");
    }

    @Override
    public void say() {
        System.out.println("老师在说话 .................");
    }
}
