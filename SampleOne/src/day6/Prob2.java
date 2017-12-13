package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob2 {

	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("1~45사이의 정수를 입력해주세요!!");
		int[] num = new int[Integer.parseInt(temp)];
	
		int a = JOptionPane.showConfirmDialog(null, "이예림입니까?", "확인메세지", 0 );
		
		if(a == 1)
		{
			
		}
		num[0] = (int)(Math.random() * Integer.parseInt(temp)) + 1;
		
		for(int i = 1; i < num.length; i++){
			num[i] = (int)(Math.random() * Integer.parseInt(temp)) + 1;
			for(int j = 0; j < i; j++){
				if(num[j] == num[i]){
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(num));
	}

}
