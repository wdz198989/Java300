package 设计模式.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:04
 * @Description : 女性
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
