package day3;

public class P130 {

	public static void main(String[] args) {
		int jumsu = 99;
		
		if(0 <= jumsu && jumsu <= 100){
			String result = (80 <= jumsu)? "Pass":"No Pass";
			System.out.println("점수: " + result);
		}
		else{
			System.out.println("오류: 점수를 확인하세요.");
		}
		//char c = (0 <= jumsu && jumsu <= 100)? '0':'X';

	
		int i = 100, j = 200;
		
		int max = (i > j)? i: j;
		
		System.out.println(max);
		System.out.println("max: " + ((i > j)? i: j));
	
	}
}
