package ���ģʽ.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/24 9:26
 * @Description : �ͻ���
 */
public class Client {
    public static void main(String[] args) {
        //����ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //����
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
