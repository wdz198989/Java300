package ���ģʽ.������ģʽ;


import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2020/4/4 16:46
 * @Description : ��ӡ���
 */
public class OutPutImpl {

    // ѧԺ����
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
   // ��������ѧԺ��Ȼ�����printDepartment���������ѧԺ��ϵ
    public void printCollege(){
       // ��collegelist��ȡ������ѧԺ
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            //ȡ��һ��ѧԺ
            College college = iterator.next();
            System.out.println("============"+college.getName()+"=============");
            printDepartment(college.createIterator());// �õ���Ӧ�ĵ�����
        }


    }
    //�����ѧԺ���ϵ
    public void printDepartment(Iterator iterator){
         while (iterator.hasNext()){
             Department d = (Department) iterator.next();
             System.out.println(d.getName()+"---------------"+d.getDesc());
         }
    }

}
