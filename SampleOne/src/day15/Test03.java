package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		
		/*System.out.println("Start");
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("sample1.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally{
			try {
				
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End");		*/
		StringBuilder data = null; 
		FileInputStream fis = null;
		String da = null;
		try {
			 fis = new FileInputStream("sample1.txt");
			  try {
				/*int data = fis.read();
				while((data = fis.read())!=-1)
				{
					System.out.println((char)data);
					
				}*/
				  while(fis.read() != -1)
				  {
					  da += fis.read();
				  }
				System.out.println(da.toCharArray());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally{
			try {
				
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End");
	}
}
