package 设计模式.迭代器模式;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:41
 * @Description : 信息工程学院
 */
public class InfoCollege implements College {
   List<Department> departmentList;

    public InfoCollege(){
        departmentList=new ArrayList<>();
        addDepartment("信息安全专业","保证不了信息安全");
        addDepartment("网络安全专业","保证不了网络安全");
        addDepartment("服务器安全专业","保证不了服务器安全");
    }

   @Override
    public String getName() {
        return "信息工程学院";
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
