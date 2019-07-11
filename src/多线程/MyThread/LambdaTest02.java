package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 10:06
 * @Description : 带参数的表达式
 */
public class LambdaTest02 {


    public static void main(String[] args) {
     ILove  love = (int a )->{
         System.out.println("I like lambda!"+a);
     };
     love.lambda(1);
      //简化
        love = ( a )->{
            System.out.println("I like lambda!"+a);
        };
        love.lambda(2);

        love =  a ->{
            System.out.println("I like lambda!"+a);
        };
        love.lambda(3);

        love =  a -> System.out.println("I like lambda!"+a);

        love.lambda(4);



    }
}

interface ILove {
    void lambda( int a );
}


//TODO  外部类
class Love implements ILove {

    @Override
    public void lambda( int a ) {
        System.out.println("I like lambda!"+a);
    }
}
