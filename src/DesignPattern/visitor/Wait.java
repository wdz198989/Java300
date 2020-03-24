package DesignPattern.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/24 9:43
 * @Description : ����
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("���������Ǵ���");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Ů�������Ǵ���");
    }
}
