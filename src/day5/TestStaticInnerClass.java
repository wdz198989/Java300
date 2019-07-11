package day5;

/**
 * 测试静态内部类
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
			System.out.println("静态内部类调用··········");
		}
		
	}
	
}