package ���ģʽ.������ģʽ;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:41
 * @Description : ��Ϣ����ѧԺ
 */
public class InfoCollege implements College {
   List<Department> departmentList;

    public InfoCollege(){
        departmentList=new ArrayList<>();
        addDepartment("��Ϣ��ȫרҵ","��֤������Ϣ��ȫ");
        addDepartment("���簲ȫרҵ","��֤�������簲ȫ");
        addDepartment("��������ȫרҵ","��֤���˷�������ȫ");
    }

   @Override
    public String getName() {
        return "��Ϣ����ѧԺ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);

    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
