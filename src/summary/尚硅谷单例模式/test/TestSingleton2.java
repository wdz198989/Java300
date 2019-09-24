package summary.尚硅谷单例模式.test;


import summary.尚硅谷单例模式.Singleton2;

public class TestSingleton2 {

	public static void main(String[] args) {
		Singleton2 s = Singleton2.INSTANCE;
		System.out.println(s);
	}

}
