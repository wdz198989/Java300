package ���ģʽ.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:06
 * @Description : �ɹ�
 */
public class Success  extends Action{


    @Override
    public void getManResult(Man man) {
        System.out.println("�������ۺܳɹ�");

    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Ů�����ۺܳɹ�");
    }
}
