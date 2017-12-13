package day8;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("002", "고길동", "개발부");
		Employee emp2 = new Employee();
		Employee emp3 = new Employee("003", "이예림", "기획부" );
		
		emp1.display();
		emp2.display();
		emp3.display();
		
		
	}
}
