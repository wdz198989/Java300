package ���߳�.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:56
 * @Description : ��̬����ģʽ
 * 1����ʵ��ɫ
 * 2�������ɫ�� ������ʵ��ɫ������
 * 3������ ʵ����ͬ�Ľӿ�
 */
public class StaticProxy {
    public static void main(String[] args) {
        //������ʵ��ɫ
        Marry you =new You();
        //���������ɫ +��ʵ��ɫ������
        WeddingCompany company =new WeddingCompany(you);
        //ִ������
        company.marry();

    }

}

//TODO �ӿ�
interface Marry{
    public  abstract void  marry();
}
//TODO ��ʵ��ɫ
class You implements Marry{

    @Override
    public void marry() {
        System.out.println("����Һ�³�۽����");
    }
}
//TODO �����ɫ
class WeddingCompany implements Marry{

    private Marry you;

    public WeddingCompany() {
    }

    public WeddingCompany(Marry you) {
        this.you = you;
    }
    public void before(){
        System.out.println("׼������");
    }
    public void after(){
        System.out.println("�ֶ���");
    }
    @Override
    public void marry() {
        before();
        you.marry();
        after();

    }
}

