package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
	
		Scanner sc = null;
		
		try(FileInputStream fis = new FileInputStream("sample3.txt");) {
			System.out.println("작업처리");

			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}catch(Exception e){
		
		}finally{
		
		}
		
		System.out.println("==========================================");
		
		try(Scanner scanner = new Scanner(new File("Sample2.txt"));)
		{
			Account a = new Account("", 400);
		}catch(FileNotFoundException e){
			System.out.println("Sample2.txt 파일을 준비하세요.");
		}catch (MoneyException e){
			System.out.println(e.getMessage());
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		
		/*try{//try(Account a = new Account("", 400);) // implements closable
			Account a = new Account("", 400);
		}catch(Exception e)
		{
			
		}*/
		System.out.println("Main End");
	}	
}
