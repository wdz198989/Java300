package 设计模式.迭代器模式;


import java.util.Iterator;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:11
 * @Description : 计算机学院迭代器实现类
 */
public class ComputerCollegeIterator implements Iterator {
    // 这里我们需要知道Department 是以怎样的方式存放
    Department[] departments;
    int position=0; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {

        if(position>=departments.length||departments[position]==null){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public Object next() {

        Department department = departments[position];
        position+=1;
        return department;
    }

    //删除方法空实现
    public void remove(){

    }
}
