package 设计模式.proxy.cglibProxy;

public class TeacherDao {
    public  void teach(){
        System.out.println("老师在授课，我是cglib代理，不需要实现接口。。。。");
    }

    public  String sayHello(){
        System.out.println("测试返回值");
        return "success";
    }

    public void say(String name){
        System.out.println(name+"老师在训话。。。。。。。。。。。。。。。。");
    }
}
