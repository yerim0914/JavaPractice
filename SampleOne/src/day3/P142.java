package day3;

import java.util.Scanner;

public class P142 {

	public static void main(String[] args) {
		//Ű���带 ���ؼ� ������ �Է¹ް�  ������ ��ȿ�ϴٸ� ���ó��
		int score = 0;
		char grade = ' ';
		
		System.out.println("������ �Է��ϼ��� �Է¿���)100 "); 
		Scanner sc = new Scanner(System.in);
		score = Integer.parseInt(sc.nextLine());
		
		if(!(0<= score && score <=100)){
			System.out.println("�������� ���� score�̹Ƿ� ����!");
			return ;
		}
		//���ó��
		System.out.println("�������� ���ó�� ");
		
		if(score >=90){
			grade = 'A';	
	    }
		else if(score >= 80){
			grade = 'B';
		}
		else if(score >= 70){
			grade = 'C';
		}
		else if(score >= 60){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println(score + "�� ����� " + grade );
  }
}
