package day5;


/**
 * @Author : WuDazhong
 * @Date :2019/7/5 15:30
 * @Description : 我做的非静态内部类测试
 */
public class WdzTest {
    public static void main(String[] args) {
        //创建内部类对象
        Out.Inner  inner = new Out().new Inner();
        inner.show();

        Out out = new Out();
        out.testOuter();



    }
}

class Out{

    private int age= 10;
    public  void  testOuter(){
        System.out.println("Outer.testOuter()");
    }

    class  Inner {
        int  age = 20;
        public  void  show(){
            int age = 30;
            System.out.println("外部类的成员变量age:"+Out.this.age);
            System.out.println("内部类的成员变量age:"+this.age);
            System.out.println("局部变量age:"+age);
        }
    }

}
