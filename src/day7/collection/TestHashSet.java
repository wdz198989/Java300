package day7.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ����HashSet�Ļ����÷�
 * Set:û��˳�򣬲����ظ���
 * List����˳�򣬿��ظ���
 * @author Administrator
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<String>  set1 = new HashSet<>();
		
		set1.add("aa");
		set1.add("bb");
		set1.add("aa");
		System.out.println(set1);
		set1.remove("bb");
		System.out.println(set1);
		
	
		Set<String>  set2 = new HashSet<>();
		set2.add("���");
		set2.addAll(set1);
		System.out.println(set2);
		
		
		
	}
}
