package summary.variable;


/**
 * @Author : WuDazhong
 * @Date :2019/7/15 21:20
 * @Description : ����== ��equals������
 */
public class test1 {
    public static void main(String[] args) {
        String a = new String("ab");
        // a Ϊһ������
       String b = new String("ab");
        // bΪ��һ������,���������һ��
        String aa = "ab";
        // ���ڳ�������
        String bb = "ab";
        // �ӳ������в���

        // true
            System.out.println(aa==bb);


            // false����ͬһ����
            System.out.println(a==b);


            System.out.println(a.equals(b));

            System.out.println(42==42.0);

    }
}