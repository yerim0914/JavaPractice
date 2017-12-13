package day12;



public class StudentTest {
	public static void main(String[] args) {
		String name = new String("java Test");
		String name2 = new String("java Test");
		
		System.out.println(name);
		
		java.util.Date date = new java.util.Date();
		System.out.println(date);
		
		Student s = new Student("홍길동", 22, 1);
		Student s2 = new Student("홍길동", 22, 1);
		System.out.println(s); //toString method 를 overriding 해야 값을 출력
		System.out.println(s.toString()); // 결과값 동일
	}
}
