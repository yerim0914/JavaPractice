package day13;

import java.util.Arrays;

public class Rectangle extends Shape{
	Point[] p = new Point[4];
	int w;
	int h;
	
	public Rectangle(){
		
	}

	public Rectangle(Point[] p, String color) {
		super(color);
		this.p = p;
		 w = p[3].getX() - p[0].getX();
		 h = p[3].getY() - p[0].getY();
	}

	@Override
	public String toString() {
		return "Rectangle [p=" + Arrays.toString(p) + ",\n w=" + w + ", h=" + h + "]";
	}
	 @Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("사각형 그리기");
	}
	public void cal(){
		 w = p[3].getX() - p[0].getX();
		 h = p[3].getY() - p[0].getY();
		 System.out.println("width: "+ w + " height: " + h);
	}
	
}
