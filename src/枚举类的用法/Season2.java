package ö������÷�;


//ʹ��enum�ؼ��ֶ���ö����
public enum  Season2 {
    //1.�ṩ��ǰö����Ķ��󣬶������֮��ʹ��","����,ĩβʹ��";"����
    //ϵͳĬ��ʹ��public static final����
    SPRING("����","���ﻨ��"),
    SUMMER("����","��������"),
    AUTUMN("����","�����ˬ"),
    WINNER("����","����ɪɪ");

    //2.����Season��������ԣ�����Ϊö�����������Բ�Ӧ�����Ķ�, ����Ӧ��ʹ�� private final����
    private final String seasonName;
    private final String seasonDesc;

    //3.ö����Ĺ�����ֻ��ʹ�� private Ȩ�����η�
    // ˽�л���������Ϊ�˱�֤����������ⲿ��������󣬷���Ͳ���ȷ������ĸ���
    private Season2(String seasonName, String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //�������󣺻�ȡö������������
    //ֻ��Ҫ�ṩ���Ե�get�������ɣ����ǲ����ṩset����������Ҳ�������ṩset��������Ϊö�����ǲ��ɱ�ĳ����࣬���ܱ��޸�
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}
