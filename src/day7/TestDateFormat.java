package day7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�������ַ���֮��Ļ���ת��
 * DateFormat�������SimpleDateFormatʵ�����ʹ��
 * @author ���
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		
		//TODO ��ʱ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ���ַ���
		DateFormat  df  = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
		String str  =  df.format(new Date(4000000)); 
		System.out.println(str);
		
		//TODO ���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ��ʱ�����
		DateFormat  df2 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		Date  date = df2.parse("1983��5��10�� 10ʱ45��59��");
		System.out.println(date);
		
		//TODO ���������ĸ�ʽ�ַ������磺����D����ñ�ʱ�������������ݵĵڼ��졣
		DateFormat  df3  = new SimpleDateFormat("D");
		String str3  =  df3.format(new Date()); 
		System.out.println(str3);
		
		
	}
}
