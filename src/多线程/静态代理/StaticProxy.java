package ���߳�.��̬����;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 21:40
 * @Description : ��̬����
 */
public class StaticProxy {

    public static void main(String[] args) {
        //WeddingCompany weddingCompany = new WeddingCompany(new You());
        //weddingCompany.HappyMarry();
        //�ȼ������棨����ڶ��̣߳�
        new WeddingCompany(new You()).HappyMarry();
        new Thread(() -> System.out.println("�Ұ���")).start();
    }
}

interface Marry{
    void HappyMarry();
}

//��ʵ��ɫ
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("����Ҫ�����");
    }
}
//�����ɫ
class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target){
     this.target=target;
    }

    @Override
    public void HappyMarry() {

        before();
        this.target.HappyMarry();
        after();

    }

    private void after() {
        System.out.println("���֮��Ĺ���");
    }

    private void before() {

        System.out.println("���֮ǰ��׼������");
    }
}
