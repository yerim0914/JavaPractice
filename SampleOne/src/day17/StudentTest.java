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
		
		try(Scanner sc = new Scanner(new File("studentdata.txt"))){ //scanner�� ���� closable implements �Ǿ�����
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
			Arrays.sort(students, 0, count); // 0���� count���� ����
			//Arrays.sort();
		}
		catch(ClassCastException e){
			System.out.println("���� ����Ű ���� �ʿ�");
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
		
		//return age - o.age; // ��������
		//return o.age - age // ��������
		//if(name.compareTo(o.name) == 0)
		//	return age - o.age;
		return (name.compareTo(o.name) != 0)? name.compareTo(o.name):age-o.age;
		//�� ���� ���� ��� ����
	}
	
	
}