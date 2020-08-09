package Java8.lamda;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 22:06
 * @Description : �Ƶ�lamda���ʽ
 */
public class Testlamda1 {

    //3.��̬�ڲ���
   static class Like2 implements ILike{

        @Override
        public void lamda() {
            System.out.println("I like lamda2");
        }
    }


    public static void main(String[] args) {
        ILike like = new Like();
        like.lamda();

        Like2 like2=new Like2();
        like2.lamda();

        //4.�ֲ��ڲ���
        class Like3 implements ILike{

            @Override
            public void lamda() {
                System.out.println("I like lamda3");
            }
        }

        Like3 like3=new Like3();
        like3.lamda();

        //5�����ڲ��࣬û��������ƣ���������ӿڻ��߸���
        like= new ILike(){

            @Override
            public void lamda() {
                System.out.println("I like lamda5");
            }
        };

        like.lamda();

        //6 lamda
        like=()->{
            System.out.println("I like lamda6");
        };
        like.lamda();
    }
}

//1.����һ������ʽ�ӿ�
interface ILike{
    void lamda();
}

//2.ʵ����
class Like implements ILike{

    @Override
    public void lamda() {
        System.out.println("I like lamda");
    }
}
