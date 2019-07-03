package day2.mianxaingduixaing;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 22:48
 * @Description : this 关键字
 */
public class TestThis {
    int a, b, c;

    TestThis(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("该构造方法被调用了");
    }

    TestThis(int a, int b, int c) {
        this(a,b);
        //TODo this(a,b) 等价于  this.a =a ;this.b==b；
        this.c = c;
    }

    void sing() {
        System.out.println("喜欢唱歌");
    }

    void eat() {
        this.sing(); // 调用本类中的sing();
        System.out.println("你妈妈喊你回家吃饭！");
    }


    public static void main(String[] args) {
        TestThis hi = new TestThis(2, 3,4);
        hi.eat();

    }
}