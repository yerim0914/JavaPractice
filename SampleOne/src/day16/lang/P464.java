package day16.lang;

public class P464 {
	public static void main(String[] args) {
		String msg = "Hello java test~~";
		System.out.println("//String Ŭ���� �ǽ�//");
		msg.replace('~', '!'); // String�� immutable�ϴ�
		System.out.println(msg.replace('~', '!'));
		System.out.println(msg); // ���� ���� �ٲ��� ����
		System.out.println("================================");
		
		msg.concat("�ٺ�");
		System.out.println(msg.concat(" �ٺ�"));
		System.out.println(msg); //�ٲ��� ����
		System.out.println("================================");
		
		StringBuffer sb = new StringBuffer("StringBuffer Test"); // String �� ��
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(" �ٺ�");
		System.out.println(sb);
		
		String s = sb.toString(); // String ���� ��ȯ
		System.out.println(s);
	}
}
