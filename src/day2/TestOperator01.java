package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 10:56
 * @Description : 测试算数运算符
 */
public class TestOperator01 {
    public static void main(String[] args) {
        byte a = 1;
        int b =2 ;
        long b2 = 3;
       // byte c = a+ b; 报错
        int c = a+ b;
        //int c2=b+b2;报错
        long c2= b +b2;

        // float f1 = 3.14; 报错
        float f1 = 3.14f;
        float f2 = b+b2;
       // float f3=f1+ 6.28; 报错
        float f3 = f1 +6.28f;


        //TODO 取模运算，“余数”符号和左边的操作数相同
        System.out.println(9%5);
        System.out.println(-9%5);
        System.out.println(9%-5);
        System.out.println(-9%-5);

        // TODO 测试自增和自减
        int q = 3;
        int p = q++;
        //执行完后，先给p赋值，再q自增
        System.out.println("q="+q +"\np="+p);
         q = 3;
         p = ++q;
         // q先自增，再给p赋值
        System.out.println("q="+q +"\np="+p);

    }
}
