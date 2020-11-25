package NotNullProblem.Test;


import java.util.Objects;

/**
 * @Author : WuDazhong
 * @Date :2020/11/25 14:20
 * @Description :jdk1.7�ṩ��Objects���ߣ�ʹ��ֱ�۷��㣬�ܶ෽���а��������˷ǿ��жϣ�
 * ����!=null�Ĵ���
 */
public class NotNullTest {
    public static void main(String[] args) {
       User zhangsan = new User(1,"����",2,1);
       User lisi = new User(2,"����",200,200);

       if(Objects.nonNull(zhangsan)&&Objects.nonNull(lisi)&&
               !Objects.equals(zhangsan.getName(),lisi.getName())){
           System.out.println("���������ֲ�ͬ");
       }
    }
}
