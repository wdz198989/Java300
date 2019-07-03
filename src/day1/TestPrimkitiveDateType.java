package day1;


import java.math.BigDecimal;

/**
 * @Author : WuDazhong
 * @Date :2019/7/1 22:54
 * @Description : 测试基本数据类型
 */
public class TestPrimkitiveDateType {
    public static void main(String[] args) {
        int a = 15;
        //TODO 八进制
        int b = 015;
        //TODO 二进制
        int c = 0b1101;
        //TODO 十六进制
        int d = 0x15;
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        float e = 3.14F;
        double f =6.28;
//TODO 浮点数是不精确的，不能用于比较
        float g = 0.1f;
        double h = 1.0/10;
        System.out.println(g==h);
        
        float a1=423432423f;
        float a2 = a1+1;
        if(a1==a2){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }

        System.out.println("---------------------------------");
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);


       BigDecimal bd2= BigDecimal.valueOf(0.1) ;
       BigDecimal bd3 = BigDecimal.valueOf(1.0 / 10);
        System.out.println(bd2.equals(bd3));


    }
}                                       
