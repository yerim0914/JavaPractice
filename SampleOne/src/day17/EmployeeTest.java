package day17;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee<Integer>();
		System.out.println(e.num); 
	}

}
class Employee<T> implements Comparable<Employee<T>>
{
	String name;
	T num;
	
	public Employee(){
	}
	
	public Employee(String name, T num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}

	@Override
	public int compareTo(Employee<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}