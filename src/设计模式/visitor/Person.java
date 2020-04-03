package 设计模式.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:04
 * @Description : 人
 */
public  abstract class Person {
    public  abstract  void accept(Action action);
}
