package day20;

import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
       Student<String,Double> s1 = new Student("", 6);
       Student<String,Integer> s2 = new Student("", 3);
       
       List<String> l;
       List<Integer> l2;
       Map<String, Student> m;       
	}
}

class Student<T,V extends Number >{
	T name;
	V avg;
	
	public Student() {	}

	public Student(T name, V avg) {
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
}
