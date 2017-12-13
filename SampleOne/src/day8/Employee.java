
package day8;
/*
 * @since 2017.11.08
 */
public class Employee {
	String name;
	String dept;
	String num;
	
	public Employee()
	{
		this("000", "사원명", "00부"); //first statement 에만 허용
		//System.out.println();
		//this("""") // 위배되므로 불가
	}
	public Employee(String num, String name, String dept)
	{
		this.name = name;
		this.num  = num;
		this.dept = dept;
	}
	public void display(){
		System.out.printf("사번: %s, 이름: %s, 부서: %s %n", num, name, dept);
	}
	
}
