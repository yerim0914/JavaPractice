package day6;

public class P214 {

	public static void main(String[] args) {
		int nums[][] = {{3, 2, 1}, {5, 4, 3, 2, 1}, {1, 2}};
		int n = 0;
		
		for(n = 0; n< nums.length; n++){
		for(int i = 0; i < nums[n].length; i++)
		{
			System.out.print(nums[n][i] + " ");
		}
		System.out.println();
		}
		System.out.println();
		int two[][] = {{3, 2, 1}, {5, 4, 3, 2, 1}, {9, 1}};
		for(int i = 0; i < two.length; i++){
			for(int j = 0; j < two[i].length; j++){
				System.out.print(two[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
