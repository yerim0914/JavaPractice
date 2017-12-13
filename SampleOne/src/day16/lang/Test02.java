package day16.lang;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] num = {77,8,99,34};
		int[] num2 = num.clone();
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(num);
		System.out.println(num2);
		
		String[] a = {"a", "b"};
		String[] a2 = a.clone();
		a[0] = "~~~~";
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a2));
		System.out.println(a);
		System.out.println(a2);
	}
}
