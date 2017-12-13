package day6;

public class Employee {
	
	String name;
	String dept;
	String number; 
	//멤버 변수 = 멤버 필드
	
	public void display()
	{
		System.out.printf("Employee [사번: %5s 이름: %5s 부서: %5s]", number, name, dept);
	}
	
	
}
