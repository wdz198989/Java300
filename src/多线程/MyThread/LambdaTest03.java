package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 10:15
 * @Description : �������ӷ���ֵ
 */
public class LambdaTest03 {

    public static void main(String[] args) {
        IInterest interest= (int a,int b) ->{
            System.out.println("I like lambda"+(a+b));
            return a+b;
        };
        interest.lambda(1,2);

        interest= (a,b) ->{
            System.out.println("I like lambda"+(a+b));
            return a+b;
        };
        interest.lambda(2,3);

        interest= (a,b) ->{
            return a+b;
        };
        interest= (a,b) ->a+b;
        System.out.println(interest.lambda(3,4));

    }
}

interface IInterest{
    int lambda( int a ,int b );
}


//TODO  �ⲿ��
class Interest implements IInterest {

    @Override
    public int lambda( int a,int b  ) {
        System.out.println("I like lambda!"+(a+b));
        return a +b;
    }
}
