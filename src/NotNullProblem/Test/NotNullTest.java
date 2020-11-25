package NotNullProblem.Test;


import java.util.Objects;

/**
 * @Author : WuDazhong
 * @Date :2020/11/25 14:20
 * @Description :jdk1.7提供了Objects工具，使用直观方便，很多方法中帮我们做了非空判断，
 * 减少!=null的代码
 */
public class NotNullTest {
    public static void main(String[] args) {
       User zhangsan = new User(1,"张三",2,1);
       User lisi = new User(2,"李四",200,200);

       if(Objects.nonNull(zhangsan)&&Objects.nonNull(lisi)&&
               !Objects.equals(zhangsan.getName(),lisi.getName())){
           System.out.println("两个人名字不同");
       }
    }
}
