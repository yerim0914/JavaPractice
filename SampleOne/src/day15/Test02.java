package day15;

public class Test02 {
	public static void main(String[] args){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("START");
		String name = null;
		if(name != null)
		System.out.println(name.toString()); //Unchecked Exception
		
		
		
		
		System.out.println("END");
	}
}
