package DesignPattern.proxy.staticProxy;

public class TeacherDao  implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("��ʦ�����ڿ�...........");
    }

    @Override
    public void say() {
        System.out.println("��ʦ��˵�� .................");
    }
}
