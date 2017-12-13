package day3;

import java.util.Scanner;

public class P154 {

	public static void main(String[] args) {
		//키보드를 통해서 점수를 입력받고  점수가 유효하다면 등급처리
		int score = 0;
		char grade = ' ';
		
		System.out.println("점수를 입력하세요 입력예시)100 "); 
		Scanner sc = new Scanner(System.in);
		score = Integer.parseInt(sc.nextLine());
		
		if(!(0<= score && score <=100)){
			System.out.println("유요하지 않은 score이므로 종료!");
			return ;
		}
		//등급처리
		System.out.println("이제부터 등급처리 ");
		
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
		System.out.println(score + "의 등급은 " + grade );
  }
}
