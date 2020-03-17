package DesignPattern.proxy.staticProxy;
//������󣬾�̬����
public class TeacherDaoProxy implements ITeacherDao{

    private  ITeacherDao target;// Ŀ�����ͨ���ӿ������д���

    // ������
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("����ʼ");

        target.teach();

        System.out.println("�������");
    }

    @Override
    public void say() {
        System.out.println("����ʼ");

        target.say();

        System.out.println("�������");
    }
}
