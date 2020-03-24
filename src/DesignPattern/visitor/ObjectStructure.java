package DesignPattern.visitor;


import java.util.LinkedList;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/3/24 9:13
 * @Description : 保存评价
 */
public class ObjectStructure {
    // 维护了一个集合
    private List<Person> persons =new LinkedList<>();

    //增加一个人
    public  void  attach(Person p){
        persons.add(p);

    }
    //移除一个人
    public  void detach(Person p){
        persons.remove(p);
    }

    //显示测评情况
    public  void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }

}
