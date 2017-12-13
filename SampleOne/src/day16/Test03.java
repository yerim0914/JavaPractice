package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		Scanner sc = null;
		
		try {
			
			fis = new FileInputStream("sample3.txt");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}finally{
			try{
			if(fis != null)
			fis.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		
		}
		System.out.println("Main End");
	}	
}
