package list.listTest1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @Author : WuDazhong
 * @Date :2020/11/26 11:01
 * @Description :
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("i");
        stringList.add("j");
        stringList.add("a");

        //һ���󽻼�
        //����1��ֱ��ͨ��retainAllֱ�ӹ���
        List<String> stringList1 =  new ArrayList<>(Arrays.asList("a,b,c,d,e,f,g,h".split(",")));
        stringList1.retainAll(stringList);
        System.out.println("����1: " + stringList1);

        //����2��ͨ�����˵�������stringList������
        List<String> stringList1_2 = new ArrayList<>(Arrays.asList("a,b,c,d,e,f,g,h".split(",")));
        List<String> strings = stringList1_2.stream()
                .filter(item -> stringList.contains(item))
                .collect(toList());
        System.out.println("����2��" + strings);

        //��������
        //���ز���
        List<String> stringList2 =  new ArrayList<>(Arrays.asList("a,b,c,d,e,f,g,h".split(",")));
        stringList2.addAll(stringList);
        System.out.println("����: " + stringList2);

        //���ز���
        List<String> stringList2_2 =  new ArrayList<>(Arrays.asList("a,b,c,d,e,f,g,h".split(",")));
        List<String> stringList_1 =  new ArrayList<>(Arrays.asList("a,b,c,i,j,a".split(",")));
        stringList2_2.removeAll(stringList_1);
        stringList_1.addAll(stringList2_2);

        System.out.println("���ز���: " + stringList_1);

        //������
        //����1��ֱ��ʹ��removeAll()����
        List<String> stringList3 =  new ArrayList<>(Arrays.asList("a,b,c,d,e,f,g,h".split(",")));
        stringList3.removeAll(stringList);
        System.out.println("�1: " + stringList3);

        //����2��ͨ�����˵���������stringList�����ݣ�Ȼ��ͱ�������н�������
        List<String> stringList3_2 = new ArrayList<>(Arrays.asList("a,b,c,d,e,f,g,h".split(",")));
        stringList3_2.retainAll(stringList3_2.stream()
                .filter(item -> !stringList.contains(item))
                .collect(toList()));
        System.out.println("�2��" + stringList3_2);
    }
}
