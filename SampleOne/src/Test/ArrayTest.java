package Test;

import java.util.Arrays;

import util.Array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] source = {77,99,33,79,44};
		
		int[] result = Array.sort(source);
		
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(result));
	}

}
