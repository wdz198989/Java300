package ö������÷�;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 21:57
 * @Description : 11
 */
public class Season2test {
     public static void main(String[] args) {
        Season2 spring = Season2.SPRING;
        System.out.println(spring);//SPRING


         //ʹ�÷������£�
         Season2[] seasons = Season2.values();
         for (int i = 0; i < seasons.length; i++) {
             System.out.println(seasons[i]);
         }
        // valueOf(String str)�����԰�һ���ַ���תΪ��Ӧ��ö�������Ҫ���ַ���������ö�������ġ����֡���
         //�粻�ǣ��ᱨ����ʱ�쳣��IllegalArgumentException��
//ʹ�÷������£�
         Season2 spring2 = Season2.valueOf("SPRING");
         System.out.println(spring2);//SPRING
         //toString()�����ص�ǰö������������
//ʹ�÷������£�
         Season2 spring3 = Season2.SPRING;
         System.out.println(spring3.toString());//SPRING
    }
}
