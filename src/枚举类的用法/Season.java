package ö������÷�;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 21:49
 * @Description :
 * ö��������Java 5�����������ԣ�����һ��������������ͣ�֮������������Ϊ������һ����(class)����ȴ�ֱ������Ͷ���Щ�����Լ����
 * ������ЩԼ���Ĵ���Ҳ�����ö�����͵ļ���ԡ���ȫ���Լ�����ԡ�����Ҫ����һ�鳣��ʱ��ǿ�ҽ���ʹ��ö���ࡣ
 * ʹ��ö�������������Ķ��������޸���ȷ���ġ����������࣬���Ķ���ֻ������һ���������߸���
 * ������ȷ���ģ���ʱ�Ϳ��԰������ඨ��Ϊһ��ö���ࣻ�������Ա��࣬���Ķ���ֻ���к�Ů������
 * ������ȷ���ģ���ʱͬ�����԰��Ա��ඨ��Ϊһ��ö���ࣻ�������缾�ڵ�������Ķ��������޸���ȷ���Ķ����Զ���Ϊһ��ö���ࡣ
 * 1��ö�����ʵ��
 * ��JDK1.5֮ǰ����û��ö�����ͣ������Ҫʹ��ö������Ҫ����ȥ�Զ��塣���Զ���ö����ʱ��Ҫע�����¼��㣺
 * (1)ö�����������Բ�Ӧ�����Ķ�������Ӧ��ʹ�� private final �������Σ�
 * (2)ö����ʹ�� private final ���ε�����Ӧ���ڹ�������Ϊ�丳ֵ��
 * (3)ö����Ĺ�����Ҫ˽�л�����֤����������ⲿ��������󣬷���Ͳ���ȷ������ĸ�����
 * (4)��ö�����ڲ�������ö�����ʵ��(ö��)����Ҫ����Ϊ��public static final��
 * ������ü��ھ��������Զ���һ��ö���ࡣ
 */
public class Season {
    //1.����Season��������ԣ�����Ϊö�����������Բ�Ӧ�����Ķ�, ����Ӧ��ʹ�� private final����
    //ö�����ʹ�� private final ���ε�����Ӧ���ڹ�������Ϊ�丳ֵ
    private final String seasonName;
    private final String seasonDesc;

    //2.˽�л�����������֤����������ⲿ��������󣬷���Ͳ���ȷ������ĸ���
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //3.�ṩ��ǰö����Ķ��ö�ٶ�������Ϊö�����ǲ��ɱ�ĳ����࣬������Ҫ����Ϊ��public static final
    public static final Season SPRING=new Season("����","���ﻨ��");
    public static final Season SUMMER=new Season("����","��������");
    public static final Season AUTUMN=new Season("����","�����ˬ");
    public static final Season WINNER=new Season("����","����ɪɪ");

    //��������1����ȡö������������
    //ֻ��Ҫ�ṩ���Ե�get�������ɣ����ǲ����ṩset��������Ϊö�����ǲ��ɱ�ĳ����࣬���ܱ��޸�
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //��������2:��ӡ�����ṩtoString��������
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}



