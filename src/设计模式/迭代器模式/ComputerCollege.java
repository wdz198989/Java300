package ���ģʽ.������ģʽ;


import java.util.Iterator;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:31
 * @Description : �����ѧԺ
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;// ���浱ǰ����Ķ������

    public ComputerCollege(){
        departments=new Department[5];
        addDepartment("Javaרҵ","�ҹ������ʵ�");
        addDepartment("������רҵ","�ҹ������ʸ�");
        addDepartment("phpרҵ","�ҹ�����");
    }


    @Override
    public String getName() {
        return "�����ѧԺ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment]=department;
        numOfDepartment+=1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
