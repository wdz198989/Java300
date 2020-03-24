package DesignPattern.visitor;


import java.util.LinkedList;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/3/24 9:13
 * @Description : ��������
 */
public class ObjectStructure {
    // ά����һ������
    private List<Person> persons =new LinkedList<>();

    //����һ����
    public  void  attach(Person p){
        persons.add(p);

    }
    //�Ƴ�һ����
    public  void detach(Person p){
        persons.remove(p);
    }

    //��ʾ�������
    public  void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }

}
