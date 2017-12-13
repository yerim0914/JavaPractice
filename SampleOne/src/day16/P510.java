package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {
	public static void main(String[] args) {
		//String filename = args[0];
		String filename = "Sample2.txt";
		int sum = 0;
		
		try (Scanner sc = new Scanner(new File(filename));){
			while(sc.hasNextLine()){
				String data = sc.nextLine();
			//	System.out.println(data);
				
				String[] datas = data.split("/");
				sum = 0;
				for(int i = 1; i < datas.length; i++){
					
					sum += Integer.parseInt(datas[i].trim());
				}
				
				System.out.printf("%s ÃÑÁ¡ : %d   Æò±Õ: %.2f", datas[0], sum, sum/3.0);
				System.out.println();
			}
		
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
	}
}
