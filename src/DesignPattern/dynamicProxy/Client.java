package DesignPattern.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        // ����Ŀ�����(***ע�ⷵ�ص��ǽӿ�ITeacherDao��������TeacherDao)
        ITeacherDao target = new TeacherDao();
          // ��Ŀ��������ɴ�����󣬲���ǿת��teacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance="+proxyInstance.getClass());
        //ͨ��������󣬵���Ŀ�귽��
        proxyInstance.teach();
        proxyInstance.sayHello("�����");

    }
}
