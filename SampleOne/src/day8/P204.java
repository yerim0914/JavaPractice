package day8;

public class P204 {

	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		
		String s2 = new String("3");
		System.out.println(s2);
		
		char[] c ={'a', 'b', 'c', 'd'};
		String s3 = new String(c);
		System.out.println(s3);
		
		String s4 = new String(c,1,2);
		System.out.println(s4);
		
		String S = "a";
		S = S + 'b';
		System.out.println(S);
	}

}
