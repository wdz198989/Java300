package day2.mianxaingduixaing;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 23:02
 * @Description : 测试static 关键字的用法
 */
public class User2 {
    int id; // id
    String name; // 账户名
    String pwd; // 密码

    static String company = "北京尚学堂"; // 公司名称


    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        //TODo 非静态方法可以调用静态的方法和成员变量
        printCompany();
        System.out.println(company);
        System.out.println("登录：" + name);
    }

    public static void printCompany() {
        //TODO 静态方法调用非静态方法，编译就会报错
//       login();
        System.out.println(company);
    }

    public static void main(String[] args) {
        User2 u = new User2(101, "高小七");
        User2.printCompany();
        User2.company = "北京阿里爷爷";
        User2.printCompany();
    }
}
