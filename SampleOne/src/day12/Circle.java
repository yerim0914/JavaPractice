package day12;

public class Circle extends Shape{
	
	@Override
	public double getArea(double r) {
		
		return Math.PI * r * r;
	}
	
}
