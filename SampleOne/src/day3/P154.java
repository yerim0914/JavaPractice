package day3;

import java.util.Scanner;

public class P154 {

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
		
		switch(score/10){
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		
		default:
			grade  = 'F';
		
		}
		System.out.println(score + "�� ����� " + grade );
  }
}
