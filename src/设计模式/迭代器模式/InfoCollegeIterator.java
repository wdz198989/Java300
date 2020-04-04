package 设计模式.迭代器模式;


import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:20
 * @Description : 信息工程学院迭代器
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList;//信息工程学院以list的形式存放系
    int index=-1;//索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中是否还有下一个元素
    @Override
    public boolean hasNext() {
        if(index>=departmentList.size()-1){
            return  false;
        }else{
            index+=1;
            return true;
        }

    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //删除方法空实现
    public void remove(){

    }
}
