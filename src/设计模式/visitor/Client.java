package 设计模式.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/24 9:26
 * @Description : 客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //评价
        Success success = new Success();
        objectStructure.display(success);


        System.out.println("===============================");
        Fail fail = new Fail();
        objectStructure.display(fail);


        System.out.println("===============================");
        Wait wait = new Wait();
        objectStructure.display(wait);


    }
}
