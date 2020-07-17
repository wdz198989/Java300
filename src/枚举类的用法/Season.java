package ö������÷�;


/**
 * @Author : WuDazhong
 * @Date :2020/7/17 21:49
 * @Description : ö��
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



