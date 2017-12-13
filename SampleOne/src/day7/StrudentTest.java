package day7;

public class StrudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		s1.name = "ÀÌ¿¹¸²";

		s1.score = new int[] { 88, 99, 55 };
		
		s1.process();
		s1.display();
	}

}
