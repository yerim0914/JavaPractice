package day13;

public class Circle extends Shape{
	Point center;
	int radius;
	
	
	public Circle() {
	}
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	public Circle(Point center, int radius, String color) {
		this.center = center;
		this.radius = radius;
		super.setColor(color);
	}
	@Override
	public String toString() {
		return "Circle [중심점=" + center + ", 반지름 = " + radius + ": " + super.getColor() + " ]";
	}
	@Override
	public void draw() {
		super.draw();
		System.out.println("원 그리기   " );
	}
	
}
