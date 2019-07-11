package day10.my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/7/10 22:16
 * @Description : ����list�ķ���
 */
public class IteratorList {

    public static void main(String[] args) {
        test();
    }
    public  static void test(){
        List<String> list = new ArrayList<>();
        list.add("�����");
        list.add("³��");
        list.add("�����ƽ");

        //TODO ����list����֮һ����ͨforѭ��
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            System.out.println(temp);

        }
        System.out.println("###################################");

        //TODO ����list����֮������ǿforѭ����ʹ�÷��ͣ�
        for(String temp :list){
            System.out.println(temp);
        }
        System.out.println("###################################");

        //TODO ����list����֮����ʹ��iterator ������1
        for(Iterator iter = list.iterator();iter.hasNext(); ){
           String  temp =(String)iter.next();
            System.out.println(temp);
        }
        System.out.println("###################################");

        //TODO ����list����֮�ģ�ʹ��iterator ������2
       Iterator iter= list.iterator();
       while (iter.hasNext()){
           Object obj = iter.next();
           iter.remove();
           System.out.println("�����ģ�"+obj);
       }
    }


}
