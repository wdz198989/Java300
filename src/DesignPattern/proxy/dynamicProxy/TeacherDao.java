package DesignPattern.proxy.dynamicProxy;

public class TeacherDao  implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("��ʦ�����ڿ���...........");
    }

    @Override
    public void sayHello(String name) {
        System.out.println(name+"��˵hello");
    }


}
