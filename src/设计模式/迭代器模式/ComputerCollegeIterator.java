package ���ģʽ.������ģʽ;


import java.util.Iterator;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:11
 * @Description : �����ѧԺ������ʵ����
 */
public class ComputerCollegeIterator implements Iterator {
    // ����������Ҫ֪��Department ���������ķ�ʽ���
    Department[] departments;
    int position=0; // ������λ��

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //�ж��Ƿ�����һ��Ԫ��
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

    //ɾ��������ʵ��
    public void remove(){

    }
}
