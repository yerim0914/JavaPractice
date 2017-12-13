/*정렬 알고리즘*/
package day6;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("배열의 사이즈를 실행 파라미터로 입력해 주세요.");
			return ;
		}
		int[] num = new int[Integer.parseInt(args[0])];
		int[] data = new int[num.length];
		int i,j = 0;
		int temp = 0;
		for(i = 0; i < num.length; i++){
		num[i] = (int)(Math.random() * 45) + 1; // 1~45
		for(j = 0; j < i; j++){
			if(num[j] == num[i])
				i--;
			} 
		}
		System.arraycopy(num, 0, data, 0, num.length);
		
		System.out.println(Arrays.toString(num));
		// 1 sol
		for(i = 0; i < num.length-1; i++){
			for(j = 0; j < num.length - 1 - i; j++){
			if(num[j] < num[j+1])
			{
				temp     = num[j];
				num[j]   = num[j+1];
				num[j+1] = temp;
			}	
			}
		}
		// 2 sol
		/*for(i = 0; i < num.length-1; i++){
			for(j = i+1; j < num.length; j++){
			if(num[i] < num[j])
			{
				temp   = num[i];
				num[i] = num[j];
				num[j] = temp;
			}	
			}
		}*/
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(data));
		
	}

}
