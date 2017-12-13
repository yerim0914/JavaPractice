package day16.lang;

public class P464 {
	public static void main(String[] args) {
		String msg = "Hello java test~~";
		System.out.println("//String 클래스 실습//");
		msg.replace('~', '!'); // String은 immutable하당
		System.out.println(msg.replace('~', '!'));
		System.out.println(msg); // 원래 값은 바뀌지 않음
		System.out.println("================================");
		
		msg.concat("바보");
		System.out.println(msg.concat(" 바보"));
		System.out.println(msg); //바뀌지 않음
		System.out.println("================================");
		
		StringBuffer sb = new StringBuffer("StringBuffer Test"); // String 과 비교
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(" 바보");
		System.out.println(sb);
		
		String s = sb.toString(); // String 으로 변환
		System.out.println(s);
	}
}
