package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 10:06
 * @Description : �������ı��ʽ
 */
public class LambdaTest02 {


    public static void main(String[] args) {
     ILove  love = (int a )->{
         System.out.println("I like lambda!"+a);
     };
     love.lambda(1);
      //��
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


//TODO  �ⲿ��
class Love implements ILove {

    @Override
    public void lambda( int a ) {
        System.out.println("I like lambda!"+a);
    }
}
