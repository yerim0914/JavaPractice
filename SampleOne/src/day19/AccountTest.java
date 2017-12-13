package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AccountTest {
	public static void main(String[] args) {
		
		Map<String, Student>  student = new HashMap<>();
		//student.put("",1234);
		//Student A = new Student();
		
		/*Student[] s = {
				new Student("È«±æµ¿", 01, 10,50),
				new Student("È«±æµ¿", 02, 10,50),
				new Student("È«±æµ¿", 03, 10,50),
				new Student("È«±æµ¿", 04, 10,50),
				new Student("È«±æµ¿", 05, 10,50)
		};
		for(int i = 0; i < s.length; i++)
		student.put(s[i].getNum(), s[i]);
		*/
		student.put("001",new Student(50,20));
		student.put("002",new Student(77,56));
		student.put("003",new Student(98,15));
		student.put("004",new Student(16,45));
		System.out.println(student);
		
		Set<String> students = student.keySet();
		Iterator<String> it = students.iterator();
		while(it.hasNext()){
			String stu = it.next();
			student.get(stu).avg(); //Æò±Õ ¸Þ¼Òµå
			System.out.println("ÇÐ¹ø: "+ stu + "  ÇÐ»ý Á¤º¸ : " + student.get(stu));
			
		}
		
	}
}
class Student{
	//String name;
	int math;
	int ko;
	int avg;
	int num;

	public Student() {
		super();
	}
	
	public Student( int math, int ko) {
		super();
		this.math = math;
		this.ko = ko;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}


	@Override
	public String toString() {
		return "Student [math=" + math + ", ko=" + ko + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avg;
		result = prime * result + ko;
		result = prime * result + math;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (avg != other.avg)
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		return true;
	}

	public int avg(){
		return avg = (ko+math)/2;
	}
	
}