package day5;


/**
 * @Author : WuDazhong
 * @Date :2019/7/5 15:30
 * @Description : �����ķǾ�̬�ڲ������
 */
public class WdzTest {
    public static void main(String[] args) {
        //�����ڲ������
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
            System.out.println("�ⲿ��ĳ�Ա����age:"+Out.this.age);
            System.out.println("�ڲ���ĳ�Ա����age:"+this.age);
            System.out.println("�ֲ�����age:"+age);
        }
    }

}
