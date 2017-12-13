package day16;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		String name = null;
		if(name != null && name.length() > 0)
		System.out.println(name.charAt(0)); //unchecked
		
		
		try {
			Class.forName("day16.Sample");
		} catch (ClassNotFoundException e) { //checked

			System.out.println("클래스없음");
		}
		
		System.out.println("main end");
	}

}
class Sample{
	
}