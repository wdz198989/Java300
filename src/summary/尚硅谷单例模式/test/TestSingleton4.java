package summary.尚硅谷单例模式.test;

import summary.尚硅谷单例模式.Singleton4;

import java.util.concurrent.*;

/**
 * @author WDZ
 */
public class TestSingleton4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Singleton4 s1 = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();

		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
		
		/*Callable<Singleton4> c = new Callable<Singleton4>() {

			@Override
			public Singleton4 call() throws Exception {
				return Singleton4.getInstance();
			}
		};*/
		Callable<Singleton4> c = () -> Singleton4.getInstance();


		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Singleton4> f1 = es.submit(c);
		Future<Singleton4> f2 = es.submit(c);
		
		Singleton4 s3 = f1.get();
		Singleton4 s4 = f2.get();
		
		System.out.println(s3 == s4);
		System.out.println(s3);
		System.out.println(s4);
		
		es.shutdown();
		
	}

}
