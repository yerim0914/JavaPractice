
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
		this("000", "�����", "00��"); //first statement ���� ���
		//System.out.println();
		//this("""") // ����ǹǷ� �Ұ�
	}
	public Employee(String num, String name, String dept)
	{
		this.name = name;
		this.num  = num;
		this.dept = dept;
	}
	public void display(){
		System.out.printf("���: %s, �̸�: %s, �μ�: %s %n", num, name, dept);
	}
	
}
