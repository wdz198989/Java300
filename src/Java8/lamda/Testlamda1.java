package Java8.lamda;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 22:06
 * @Description : 推导lamda表达式
 */
public class Testlamda1 {

    //3.静态内部类
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

        //4.局部内部类
        class Like3 implements ILike{

            @Override
            public void lamda() {
                System.out.println("I like lamda3");
            }
        }

        Like3 like3=new Like3();
        like3.lamda();

        //5匿名内部类，没有类的名称，必须借助接口或者父类
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

//1.定义一个函数式接口
interface ILike{
    void lamda();
}

//2.实现类
class Like implements ILike{

    @Override
    public void lamda() {
        System.out.println("I like lamda");
    }
}
