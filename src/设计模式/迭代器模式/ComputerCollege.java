package 设计模式.迭代器模式;


import java.util.Iterator;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:31
 * @Description : 计算机学院
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;// 保存当前数组的对象个数

    public ComputerCollege(){
        departments=new Department[5];
        addDepartment("Java专业","找工作工资低");
        addDepartment("大数据专业","找工作工资高");
        addDepartment("php专业","找工作难");
    }


    @Override
    public String getName() {
        return "计算机学院";
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
