package day5.array;

import java.util.Arrays;

/**
 * ����java.util.Arrays�������ʹ��
 * @author Administrator
 *
 */
public class TestArrays {
	public static void main(String[] args) {
		
		int[]  a = {100,20,30,5,150,80,200};
		
		System.out.println(a);
		
		System.out.println(Arrays.toString(a));  
		Arrays.sort(a); 
		System.out.println(Arrays.toString(a));  
		
		System.out.println("Ҫ����Ԫ�ص�����ֵΪ��"+Arrays.binarySearch(a, 30));
		
		
		
	}
}