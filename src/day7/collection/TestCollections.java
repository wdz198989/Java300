package day7.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections�������ʹ��
 * Collection�ǽӿڣ�Collections�ǹ�����
 * @author ���
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		List<String>  list  = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add("gao:"+i);
		}
		System.out.println(list);
		//�������list�е�Ԫ��
		Collections.shuffle(list);
		System.out.println(list);
		//��������
		Collections.reverse(list);
		System.out.println(list);
		//���յ����ķ�ʽ�����Զ������ʹ�ã�Comparable�ӿڡ�
		Collections.sort(list);
		System.out.println(list);
		//���ַ����ң����ߣ��۰����
		System.out.println(Collections.binarySearch(list, "gao:1"));
		
		
	}
}
