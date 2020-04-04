package 设计模式.迭代器模式;


import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:46
 * @Description : 打印输出
 */
public class OutPutImpl {

    // 学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
   // 遍历所有学院，然后调用printDepartment，输出各个学院的系
    public void printCollege(){
       // 从collegelist中取出所有学院
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            //取出一个学院
            College college = iterator.next();
            System.out.println("============"+college.getName()+"=============");
            printDepartment(college.createIterator());// 得到对应的迭代器
        }


    }
    //输出：学院输出系
    public void printDepartment(Iterator iterator){
         while (iterator.hasNext()){
             Department d = (Department) iterator.next();
             System.out.println(d.getName()+"---------------"+d.getDesc());
         }
    }

}
