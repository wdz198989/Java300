package ���ģʽ.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:04
 * @Description : Ů��
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
