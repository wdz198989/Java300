package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 9:53
 * @Description : ����
 */
public class LambdaTest01 {
    //TODO  ��̬�ڲ���
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("I like lambda2!");
        }
    }

        public static void main(String[] args) {
            ILike like = new Like();
            like = new Like2();
            like.lambda();
            //TODO  �����ڲ���
            like=new ILike() {
                @Override
                public void lambda() {
                    System.out.println("I like lambda3!");
                }
            };
            like.lambda();

            //TODO  Lambda���ʽ
            like=()->{
                System.out.println("I like lambda4!");
            };
            like.lambda();
        }
    }


    interface ILike {
        void lambda();
    }
     //TODO  �ⲿ��
    class Like implements ILike {

        @Override
        public void lambda() {
            System.out.println("I like lambda!");
        }
    }
