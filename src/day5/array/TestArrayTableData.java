package day5.array;

import java.util.Arrays;

/**
 * ��������洢�������
 * @author Administrator
 *
 */
public class TestArrayTableData {
	public static void main(String[] args) {
		Object[]  emp1 = {1001,"���",18,"��ʦ","2006.6.6"};
		Object[]  emp2 = {1002,"��2�",19,"����Ա","2016.6.6"};
		Object[]  emp3 = {1003,"��3�",22,"����","2026.6.6"};
		
		Object[][] tableData = new Object[3][];
		tableData[0] = emp1;
		tableData[1] = emp2;
		tableData[2] = emp3;
		
		for(Object[] temp: tableData){
			System.out.println(Arrays.toString(temp));
		}
		
		
	}
}
