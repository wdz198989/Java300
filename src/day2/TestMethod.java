package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 19:44
 * @Description : 测试方法的基本使用
 */
public class TestMethod {
    public static void main(String[] args) {
        //通过对象调用普通方法
        TestMethod   tm  = new TestMethod();
        tm.printSxt();
        int c = tm.add(30, 40, 50)+1000;
        System.out.println(c);
    }

    void  printSxt(){
        System.out.println("北京尚学堂...");
        System.out.println("上海尚学堂...");
        System.out.println("广州尚学堂...");

    }

    int  add(int a, int b, int c){
        int  sum =  a+b+c;
        System.out.println(sum);
        //return 两个作用：1.结束方法的运行。2.返回值
        return  sum;
    }

}