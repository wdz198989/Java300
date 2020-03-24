package DesignPattern.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:04
 * @Description : ÄÐÐÔ
 */
public class Man extends  Person {
    @Override
    public void accept(Action action) {
         action.getManResult(this);
    }
}
