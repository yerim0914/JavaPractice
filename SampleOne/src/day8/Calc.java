/* 다형성 */
package day8;

public class Calc {
	/*
	public static int add(int a, int b)
	{
		return a + b;
	}
	public static int add(int a, int b, int c)
	{
		return a + b + c;
	}*/
	public static int add(int...a){ // ...a: 크기가 정해지지 않은 배열
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	public static int addd(int[] a){ 
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	public static double add(double a, double b){
		
		return a + b;
	}
}

