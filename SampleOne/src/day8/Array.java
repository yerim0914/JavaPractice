package day8;

import java.io.InputStream;
import java.util.Scanner;

public class Array {
	 public static int[] sort(int[] a){
	       
	       // 유용하게 사용 가능한  함수를 만들어 보세요.. 
	       // 단 source data a는 보존이 되도록만드세요
		 int [] b = new int[a.length];
		 System.arraycopy(a, 0, b, 0, a.length);
		 int temp   = 0;
		 int select = 0;
		 
		 System.out.println("배열을 오름차순 정렬(0) 또는 내림차순 정렬(1)을 입력해주세요. ");
		 Scanner sc = new Scanner(System.in);
		 select = sc.nextInt();

		 for(int i = 0; i < b.length - 1; i++){ // 오름차순
			 for(int j = 0; j < b.length - 1 - i; j++){
			if((select ==1 )?(b[j] < b[j+1]):(b[j] > b[j+1])){
				temp   = b[j];
				b[j]   = b[j+1];
				b[j+1] = temp;
			}
			}
		 }
		 
		 return b;
	 }
 public static void main(String[] args) {
		 
		 int [] a = {10,2,3,4,5};
		 int [] b = new int[5];
		 b = Array.sort(a);
		 System.out.printf("%d %d %d %d %d",b[0], b[1],b[2],b[3], b[4]);

		}
}
