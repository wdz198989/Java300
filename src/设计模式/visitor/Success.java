package 设计模式.visitor;


/**
 * @Author : WuDazhong
 * @Date :2020/3/23 22:06
 * @Description : 成功
 */
public class Success  extends Action{


    @Override
    public void getManResult(Man man) {
        System.out.println("男人评价很成功");

    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人评价很成功");
    }
}
