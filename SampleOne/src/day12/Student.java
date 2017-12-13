package day12;

public class Student extends Object{
	private String name;
	private int age;
	private int id;

	public Student() {
		super(); //생략가능
	}
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		
		//return "Student [" + name+","+ age + ", " + "id" + "]"; // 성능 저하
		//string buffer /string builder 사용권장
		StringBuilder ab = new StringBuilder();
		ab.append("Student [ ");
		ab.append(name);
		ab.append(", ");
		ab.append("age");
		ab.append(", ");
		ab.append("id");
		ab.append(" ]");
		
		return ab.toString();
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
		Student a = (Student)obj;
		if(this.name == a.name && this.age == a.age && this.id == a.id)
			return true;
		else
			return false;
		}
		else
			return false;
	}*/
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student a = (Student)obj;
		if(name.equals(name) && this.age == a.age && this.id == a.id){
			return true;
	}
			return false;
	}
	
}

