/* ������ */
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
	public static int add(int...a){ // ...a: ũ�Ⱑ �������� ���� �迭
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

