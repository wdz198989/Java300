package DesignPattern.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:08
 * @Description : 失败
 */
public class Fail extends  Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人评价很失败");

    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("男人评价很失败");

    }
}
