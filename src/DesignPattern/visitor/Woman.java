package DesignPattern.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:04
 * @Description : ХЎад
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
