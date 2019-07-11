package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 9:53
 * @Description : 测试
 */
public class LambdaTest01 {
    //TODO  静态内部类
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
            //TODO  匿名内部类
            like=new ILike() {
                @Override
                public void lambda() {
                    System.out.println("I like lambda3!");
                }
            };
            like.lambda();

            //TODO  Lambda表达式
            like=()->{
                System.out.println("I like lambda4!");
            };
            like.lambda();
        }
    }


    interface ILike {
        void lambda();
    }
     //TODO  外部类
    class Like implements ILike {

        @Override
        public void lambda() {
            System.out.println("I like lambda!");
        }
    }
