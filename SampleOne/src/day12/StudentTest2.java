package day12;

public class StudentTest2 {
	public static void main(String[] args) {
		String name = new String("java Test");
		String name2 = new String("java Test");
		
		System.out.println(name == name2); // 두 개의 주소값 다름
		System.out.println(name.equals(name2));
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date == date2);
		System.out.println(date.equals(date2));
		
		Student s = new Student("홍길동", 22, 1);
		Student s2 = new Student("홍길동", 22, 1);
		String s3 = null;
		System.out.println(s == s2); 
		System.out.println(s.equals(s2)); //equals method 를 overriding 해야 객체 비교 가능
		System.out.println(s.equals(s3)); 
		
		
		
	}
}
