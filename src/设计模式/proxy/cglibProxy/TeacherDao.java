package ���ģʽ.proxy.cglibProxy;

public class TeacherDao {
    public  void teach(){
        System.out.println("��ʦ���ڿΣ�����cglib��������Ҫʵ�ֽӿڡ�������");
    }

    public  String sayHello(){
        System.out.println("���Է���ֵ");
        return "success";
    }

    public void say(String name){
        System.out.println(name+"��ʦ��ѵ����������������������������������");
    }
}
