package day5.array;

import java.util.Arrays;

/**
 * 测试二维数组
 * @author Administrator
 *
 */
public class Test2DimensionArray {
	
	public static void main(String[] args) {
	    int[]  a1 = new int[3];
	     a1[0]=5;
	     a1[1]=10;
	     a1[2]=15;
		System.out.println(Arrays.toString(a1));
    	Car[]  cars = new Car[3];
    	cars[0]=new Car("大众",1000000);
		cars[1]=new Car("奔驰",2000000);
		cars[2]=new Car("宝马",3000000);
		System.out.println(Arrays.toString(cars));
		
		int[][]  a = new  int[3][];
		
		a[0] = new int[]{20,30};
		a[1] = new int[]{10,15,80};
		a[2] = new int[]{50,60};
		
		System.out.println(a[1][2]);  

		
		//静态初始化二维数组
		int[][]  b = {
				{20,30,40},
				{50,20},
				{100,200,300,400}
		};
		
		System.out.println(b[2][3]);
		
		
	}
	
	
}

class Car{
	String name;

	int price;

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}