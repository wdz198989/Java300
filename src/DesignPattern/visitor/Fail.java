package DesignPattern.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:08
 * @Description : ʧ��
 */
public class Fail extends  Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("�������ۺ�ʧ��");

    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("�������ۺ�ʧ��");

    }
}
