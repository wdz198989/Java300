package ö������÷�;


public enum Season4 implements Show {
    //1.�ṩ��ǰö����Ķ��󣬶������֮��ʹ��","����,ĩβʹ��";"����
    //ϵͳĬ��ʹ��public static final����
    SPRING("����","���ﻨ��"){
        //ÿ��ö�ٶ���ֱ���ʵ�ָ÷���
        @Override
        public void show() {
            System.out.println("������һ�����ﻨ��ļ��ڣ�");
        }
    },
    SUMMER("����","��������"){
        @Override
        public void show() {
            System.out.println("������һ���������׵ļ��ڣ�");
        }
    },
    AUTUMN("����","�����ˬ"){
        @Override
        public void show() {
            System.out.println("������һ�������ˬ�ļ��ڣ�");
        }
    },
    WINNER("����","����ɪɪ"){
        @Override
        public void show() {
            System.out.println("������һ������ɪɪ�ļ��ڣ�");
        }
    };

    //2.����Season��������ԣ�����Ϊö�����������Բ�Ӧ�����Ķ�, ����Ӧ��ʹ�� private final����
    private final String seasonName;
    private final String seasonDesc;

    //3.ö����Ĺ�����ֻ��ʹ�� private Ȩ�����η�
    // ˽�л���������Ϊ�˱�֤����������ⲿ��������󣬷���Ͳ���ȷ������ĸ���
    private Season4(String seasonName, String seasonDesc){
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

