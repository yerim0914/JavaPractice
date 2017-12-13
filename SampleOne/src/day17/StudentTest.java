package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[100];
		int count = 0;
		
		try(Scanner sc = new Scanner(new File("studentdata.txt"))){ //scanner라서 가능 closable implements 되어있음
			while(sc.hasNextLine()){
				String readline = sc.nextLine();
				String[] data = readline.split("/");
				students[count] = new Student(data[0], Integer.parseInt(data[1]));
				count++;
			}
		}catch(Exception e){
			if(e instanceof FileNotFoundException){
				System.out.println("X");
			}else{
				e.printStackTrace();
			}
		}finally{
		}
		
		try{
			Arrays.sort(students, 0, count); // 0부터 count까지 정렬
			//Arrays.sort();
		}
		catch(ClassCastException e){
			System.out.println("정렬 기준키 설정 필요");
		}
		
		//System.out.println(Arrays.toString(students));
		for(int i = 0; i < count; i++){ //students.length X
			System.out.println(students[i]);
			System.out.println("----------------------------------------");
		}
		
		
		
		System.out.println("Main end");
	}
}

class Student implements Comparable<Student> {
	String name;
	int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		//return age - o.age; // 오름차순
		//return o.age - age // 내림차순
		//if(name.compareTo(o.name) == 0)
		//	return age - o.age;
		return (name.compareTo(o.name) != 0)? name.compareTo(o.name):age-o.age;
		//두 가지 기준 모두 적용
	}
	
	
}