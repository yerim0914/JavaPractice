package day20;

import java.util.Iterator;
import java.util.Vector;

import day12.Student;

public class Prob2 {
	Student s1;
	Vector<Integer> nums;
	
	public void print(){
		if(s1!=null){
			System.out.println(s1);
		}
		if(nums!=null){
			System.out.println(nums);
		}
	}
	
	public int sum(){
		int sum = 0;
		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {
			Integer a = (Integer) it.next();
			sum += a;
		}
		
		return sum;
	}
	
	
}
