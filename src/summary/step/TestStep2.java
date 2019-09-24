package summary.step;

import org.junit.Test;

public class TestStep2 {
	@Test
	public void test(){
		long start = System.currentTimeMillis();
		System.out.println(loop(100000000));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	public int loop(int n){
		if(n<1){
			throw new IllegalArgumentException(n + "����С��1");
		}
		if(n==1 || n==2){
			return n;
		}
		
		int one = 2;
		//��ʼ��Ϊ�ߵ��ڶ���̨�׵��߷�
		int two = 1;
		//��ʼ��Ϊ�ߵ���һ��̨�׵��߷�
		int sum = 0;
		
		for(int i=3; i<=n; i++){
			//����2�� + ����1�����߷�
			sum = two + one;
			two = one;
			one = sum;
		}
		return sum;
	}
}
