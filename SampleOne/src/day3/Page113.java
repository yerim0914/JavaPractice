package day3;

public class Page113 {

	public static void main(String[] args) {
		int i = 10, j = 10;
		System.out.println(i==j);

		String name1 = new String("Hello");
		String name2 = new String("Hello");
		String name3 = name1;
		
		System.out.println("name1==name2?" + (name1==name2));
		System.out.println("name1==name3?" + (name1==name3));
		System.out.println("name1.equals(name2) => " + name1. equals(name2));
		System.out.println("name1.equals(name3) => " + name1.equals(name3));
		System.out.println("");
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(1));
		
		System.out.println("");
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));

		
		
	}

}
