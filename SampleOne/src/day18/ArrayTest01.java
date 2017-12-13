package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class ArrayTest01 {
	public static void main(String[] args) {

		Student[] s = new Student[100];
		List<Student> data = new Vector<Student>();	
		data.add(new Student("³²±Ã¼º", 50, 99));
		data.add(new Student("ÀÌ¿¹¸²", 50, 91));
		data.add(new Student("°©¼øÀÌ", 56, 99));
		data.add(new Student("°©¼øÀÌ¤·", 56, 99));
		//System.out.println(data);
		//data.remove(0);
		//System.out.println(data);
		/*int delindex = 0;
		for(int i = 0; i < data.size(); i++){
			data.get(i).avg();
	
			if(data.get(i).name.equals("³²±Ã¼º")){
				delindex= i;
			}
		} 
		data.remove(delindex);
	
		System.out.println(data);
		
		for(Student a : data){
			System.out.println(data);
			a.avg();
			data.remove(a);
		}
		System.out.println(data);
		*/
		Iterator<Student> it = data.iterator();
		while(it.hasNext()){
			Student da = it.next();
			//if(da.name.equals("³²±Ã¼º"))
			
			//it.remove();
		}
		System.out.println(data.contains(new Student("°©¼øÀÌ¤·", 56, 99)));
		//Arrays.sort(data.toArray());
		Collections.sort(data);
		for(Student a : data){
		//	System.out.println(a);
		//	System.out.println("===========================");
		}
		
		
		//System.out.println(data);
		//Student[] temp = (Student[]) data.toArray();
		
		Student[] temp = new Student[data.size()];
		data.toArray(temp);
		Arrays.sort(temp);
		for(Student a : temp){
				System.out.println(a);
				System.out.println("===========================");
			}
		
		Student[] temp2 = new Student[data.size()];
		data.toArray(temp2);
		
	}
}
class Student implements Comparable<Student>{
	String name;
	int ko, math;
	double avg;
	
	public Student() {
		super();
	}
	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}
	public void avg(){
		
		avg = (ko + math)/2.0;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
	}
	
	
	
}
