package day8;

import java.io.InputStream;
import java.util.Scanner;

public class Array {
	 public static int[] sort(int[] a){
	       
	       // �����ϰ� ��� ������  �Լ��� ����� ������.. 
	       // �� source data a�� ������ �ǵ��ϸ��弼��
		 int [] b = new int[a.length];
		 System.arraycopy(a, 0, b, 0, a.length);
		 int temp   = 0;
		 int select = 0;
		 
		 System.out.println("�迭�� �������� ����(0) �Ǵ� �������� ����(1)�� �Է����ּ���. ");
		 Scanner sc = new Scanner(System.in);
		 select = sc.nextInt();

		 for(int i = 0; i < b.length - 1; i++){ // ��������
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
