package DesignPattern.template;
// �����࣬��ʾ����
public abstract class SoyaMilk {
    // ģ�巽���������final����ֹ���า��
    final void make(){
      select();;
      addCondiments();
      soak();
      beat();
    }

    // ѡ����
     void select(){
         System.out.println("��һ����ѡ��õĻƶ�");
     }

     //��Ӳ�ͬ���ϣ����󷽷�������ȥʵ��
    abstract  void addCondiments();

    // ���ݣ��������д��Ҳ���Բ���д��
    void soak(){
        System.out.println("������:����");
    }

    // ��
    void beat(){
        System.out.println("���Ĳ�����");
    }
}
