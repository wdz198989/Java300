package 设计模式.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:02
 * @Description : 测评结果
 */
public  abstract class Action {

    public abstract  void getManResult(Man man);

    public  abstract  void getWomanResult(Woman woman);
}
