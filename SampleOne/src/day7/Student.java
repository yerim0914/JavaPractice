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
		System.out.println("���� ó�� ��� ǥ");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + Arrays.toString(score));
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
	
	}
}

