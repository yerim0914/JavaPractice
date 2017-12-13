package day8;

import java.util.Arrays;

public class Student {
	String num;
	String name;
	int[] score = new int[2];
	int sum;
	
	public Student()
	{
		this("","",new int[]{0,0});
		
	}
	public Student(String num, String name, int[] score){
		this.num = num;
		this.name = name;
		this.score = score;
	}

	//배열 질문
}
