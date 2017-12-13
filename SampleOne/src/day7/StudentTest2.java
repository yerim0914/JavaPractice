package day7;

public class StudentTest2 {

	public static void main(String[] args) {
		Student[] s = {
				new Student(),
				new Student(),
				new Student(),
				new Student(),
				new Student()
		};
		
		s[4].name = "ÃÖ¾¾";
		s[4].score = new int[]{99,99,99};
		
		for(int i = 0; i < s.length; i++){
			s[i].process();
			s[i].display();
		}
		

	}

}
