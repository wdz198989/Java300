package DesignPattern.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/24 9:43
 * @Description : 待定
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人评价是待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人评价是待定");
    }
}
