package day5;

/**
 * ���Ծ�̬�ڲ���
 * @author Administrator
 *
 */
public class TestStaticInnerClass {
	public static void main(String[] args) {

		Outer2.Inner2  inner = new Outer2.Inner2(); 
		
		inner.show();
		
	}
}

class Outer2 {
	
	
	static class Inner2{
		public  void show(){
			System.out.println("��̬�ڲ�����á�������������������");
		}
		
	}
	
}