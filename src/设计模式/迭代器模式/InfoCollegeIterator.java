package ���ģʽ.������ģʽ;


import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:20
 * @Description : ��Ϣ����ѧԺ������
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList;//��Ϣ����ѧԺ��list����ʽ���ϵ
    int index=-1;//����

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //�ж�list���Ƿ�����һ��Ԫ��
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

    //ɾ��������ʵ��
    public void remove(){

    }
}
