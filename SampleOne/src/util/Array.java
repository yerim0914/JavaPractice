package util;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 * @author student
 *
 */
public class Array {
	 public static int[] sort(int[] a){ // return a ����X
	       
	       // �����ϰ� ��� ������  �Լ��� ����� ������.. 
	       // �� source data a�� ������ �ǵ��ϸ��弼��
		 int [] b = new int[a.length];
		 System.arraycopy(a, 0, b, 0, a.length);
		 int temp   = 0;
		 int select = 0;
		 
		 System.out.println("�迭�� �������� ����(0) �Ǵ� �������� ����(1)�� �Է����ּ���. ");
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
