package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		//Employee[] emp = new Employee[100]; // 불편해
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("007", "홍", "기술부"));
		list.add(new Employee("006", "홍길", "기술부"));
		list.add(new Employee("003", "홍길동", "기술부"));
		list.add(new Employee("001", "동", "기술부"));
		list.add(new Employee("012", "길동", "기술부"));
		list.add(new Employee("005", "길", "기술부"));
		list.add(new Employee("009", "동", "기술부"));
		// 정렬 후 출력
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------------");
		// 삭제
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()){
			Employee data = it.next();
			if(data.getNum().equals("006")){
				System.out.println(data + " 사원 정보 제거 됩니다.");
				it.remove();
			}
		}
		System.out.println("============= 현재 사원 목록 ========================");
		for(Employee dat : list){
			System.out.println(dat);
		}
		System.out.println("===============================================");
		System.out.println("이름이 홍씨인 사원 목록 검색");
		for(Employee data:list){
			if(data.getName().charAt(0) == '홍'){
				System.out.println(data);
			}
		}
		System.out.println("===============================================");
		
		Employee[] data = new Employee[list.size()];
		System.out.println(Arrays.toString(data));
		list.toArray(data);
		System.out.println(Arrays.toString(data));
		
		
	}
}
class Employee extends Object implements Comparable<Employee>{
	String num; //기본키
	String name;
	String dept;
	
	public Employee() {
		super();
	}
	public Employee(String num, String name, String dept) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return Integer.parseInt(num) - Integer.parseInt(o.num);
	}
	
	
	
	
}