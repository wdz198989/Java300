package DesignPattern.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        //����Ŀ����󣨱��������
        TeacherDao teacherDao = new TeacherDao();
        //�����������,ͬʱ����������󴫵ݸ��������
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();
        teacherDaoProxy.say();

    }
}
