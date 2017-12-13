package day7;

public class Employee {
	
	String name = "";
	String num;
	String dept; //member variable 
	
	public void display() // method
	{
		System.out.printf("Employee[사번: %s 이름: %s 부서: %s ]%n", num, name, dept);
	}
	
}
