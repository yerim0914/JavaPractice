package day16.lang;

public class Test03 {
	public static void main(String[] args) {
		
		Point p1 = new Point(1, 1);

		
		System.out.println(p1);
	
		Point p2 = p1.clone();
		System.out.println(p2);

		p1.setX(99);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
