package util;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 * @author student
 *
 */
public class Array {
	 public static int[] sort(int[] a){ // return a 보존X
	       
	       // 유용하게 사용 가능한  함수를 만들어 보세요.. 
	       // 단 source data a는 보존이 되도록만드세요
		 int [] b = new int[a.length];
		 System.arraycopy(a, 0, b, 0, a.length);
		 int temp   = 0;
		 int select = 0;
		 
		 System.out.println("배열을 오름차순 정렬(0) 또는 내림차순 정렬(1)을 입력해주세요. ");
		 Scanner sc = new Scanner(System.in);
		 select = sc.nextInt();

		 for(int i = 0; i < b.length-1; i++){
				for(int j = i+1; j < b.length; j++){
			if((select == 1)?(b[i] < b[j]):(b[i] > b[j])){
					temp   = b[i];
					b[i] = b[j];
					b[j] = temp;
				}	
		 }
				}
		 
		 return b;
	 }
}
