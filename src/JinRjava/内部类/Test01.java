package JinRjava.�ڲ���;

/**
 * @Author : WuDazhong
 * @Date :2019/7/13 10:18
 * @Description : ����ʵ��
 *
 * ����HandleAble�ӿڣ��߱�һ�������ַ������ֵĳ��󷽷�����HandleString��String num����
 *
 *     ����ʽ1��ȡ�������֡�
 *     ����ʽ2������ָ��λС�����������롣
 *     �����ڲ���ķ�ʽ���������г��󷽷���
 */
public class Test01 {
    public static void main(String[] args) {

        String str = "23.23456789";
        System.out.println("ԭ�����ַ���:" + str);

        HandleAble s1 = new HandleAble() {
            @Override
            public String handleString(String str) {
                return str.substring(0, str.indexOf("."));
            }
        };
        String string = s1.handleString(str);

        System.out.println("ȡ����:" + string);

        int num = 4;

        HandleAble s2 = new HandleAble() {
            @Override
            public String handleString(String str) {

                int i = str.indexOf(".") + num + 1;
                char c = str.charAt(i);

                if (c <= '4') {
                    return str.substring(0, i).toString();
                } else {
                    char c1 = (char) (str.charAt(str.indexOf(".") + num) + 1);
                    return str.substring(0, i - 1) + c1;

                }
            }
        };
        String sss = s2.handleString(str);
        System.out.println("����" + num + "λС����:" + sss);

    }
}
interface HandleAble {
    public abstract String handleString(String str);
}

