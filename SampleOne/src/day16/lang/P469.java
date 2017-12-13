package day16.lang;

import java.util.Arrays;

public class P469 {
	public static void main(String[] args) {
		
		String[] ss = {"x","abc","bb","44"};
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		System.out.println("x".compareTo("az"));
		System.out.println("aa".compareTo("bb"));
		System.out.println("b".compareTo("b"));
		System.out.println("c".compareTo("a"));
		System.out.println("============================");
		
		String msg = "Hello java test...";
		System.out.println(msg.indexOf("Hello"));
		System.out.println(msg.lastIndexOf(' ') + 1);
		System.out.println(msg.indexOf('t'));
		System.out.println(msg.indexOf('t', 3));// 3��ġ���� t Ȯ��
		System.out.println(msg.indexOf('z')); //����
		System.out.println("============================");
		
		System.out.println(msg.substring(0, 5)); // begin <= x < end
		System.out.println(msg.substring(6, 10)); 
		System.out.println(msg.substring(msg.indexOf('t'))); 
		System.out.println(msg.substring(msg.lastIndexOf(' ') + 1)); 
		System.out.println("============================");
		
		String data = "ȫ�浿 / 90/70/77";
		String[] datas = data.split("/");
		Float sum = 0F;
		for(int i = 1; i < datas.length; i++){
			//System.out.println(datas[i].trim());
			sum += Float.parseFloat(datas[i].trim());
		}
		
		System.out.printf("�̸�: %s ����: %f ���: %f", datas[0], sum, sum/3.0);
		
		
	}
}
