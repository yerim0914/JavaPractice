package day3;

public class P120 {

	public static void main(String[] args) {
		char c = '!';
		boolean f1, f2;
		boolean result =  (f1 = '0' <= c)  && (f2 = c <= '9'); //��������
		System.out.println(result);
		boolean result1 = f2 = (48 <= c & c <= 57);  //��������
		

		System.out.println('0' +"  "+ (int)'0');
		System.out.println('0' +"  "+ (int)'9');
		
		result = ('a' <= c && c <= 'z'); //�ҹ�������
		System.out.println(result);
		
		result = ('A' <= c && c <= 'Z'); //�빮������
		System.out.println(result);
		
		System.out.println("");
		System.out.println(Integer.toBinaryString(11|3));
		
		
	}

}
