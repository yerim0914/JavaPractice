package day3;

import java.util.Scanner;

public class P117{
  
  public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("������ �ϳ� �Է��ϼ���");
	//String data = input.nextLine();
	//char c = data.charAt(0);
		
	char c = input.nextLine().charAt(0);
	
	boolean result = ('A' <= c && c <= 'z'); 
	
	//System.out.println("\n �Էµ�����: " + data);				
	System.out.println("\n �Է¹���: " + c + result);
  }
}