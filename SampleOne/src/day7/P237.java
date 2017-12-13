package day7;

public class P237 {
	public static void main(String[] args) {
		int[] score;
		String name;
		Employee emp1;
		emp1 = new Employee();
		emp1.display();
		emp1.num  = "123";
		emp1.name = "yerim";
		emp1.dept = "영업부";
		
		Employee emp2 = new Employee();
		emp2.display();
		
		emp2.num  = "124";
		emp2.name = "merim";
		emp2.dept = "개발부";
		
		

		emp1.display();
		emp2.display();
	}

}
