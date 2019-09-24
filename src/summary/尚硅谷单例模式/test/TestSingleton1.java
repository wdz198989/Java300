package summary.尚硅谷单例模式.test;


import summary.尚硅谷单例模式.Singleton1;

public class TestSingleton1 {

	public static void main(String[] args) {
		Singleton1 s = Singleton1.INSTANCE;
		System.out.println(s);
	}

}
