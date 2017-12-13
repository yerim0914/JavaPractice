package day13;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.getClass());
		
		Student s1 = s;
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		Student[] stu = {s, new Student("b",2), new Student()};
		for(int i = 0; i < stu.length; i++){
			System.out.println(stu[i]); // toString È£ÃâµÊ
		}
		
	}

}
