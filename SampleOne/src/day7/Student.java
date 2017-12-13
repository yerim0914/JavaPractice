package day7;

import java.util.Arrays;

public class Student {
	String name;
	int[] score = new int [3];
	double sum;
	double avg;
	
	public void process()
	{
		for(int i = 0; i < score.length; i++)
		sum += score[i];
		
		avg = sum/score.length;
	}
	public void display()
	{
		System.out.println("성적 처리 결과 표");
		System.out.println("이름: " + name);
		System.out.println("성적: " + Arrays.toString(score));
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	
	}
}

