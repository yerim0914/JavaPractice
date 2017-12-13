package day16;

import java.util.Arrays;

public class Test05 {
	
	public static void main(String[] args) {
		
		for(int i =1 ; i < 9;i++){
			for(int j = 2;j<=9;j++){
				if(j==3)break;
				System.out.printf("%2d*%d=%2d",j,i,i*j);
			}
			System.out.println();
		}
	
	}

}
