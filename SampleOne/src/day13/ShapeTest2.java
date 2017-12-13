package day13;

public class ShapeTest2 {

	public static void main(String[] args) {
		
		Point[] p = {
				new Point(10,10), new Point(20,10), new Point(10,20), new Point(20,20)
				};
		Rectangle R1= new Rectangle(p, "Blue");
		System.out.println(R1);
		R1.draw();
		
		R1.cal();
		System.out.println(R1.h);
	}

}
