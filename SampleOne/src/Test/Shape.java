package Test;

public abstract class Shape { //객체 생성 불가능 -> abstract
	protected double area;
	protected String name; //instance variable
	
	public abstract void calculationArea();
	
	@Override
	public String toString() {
		return "[" + name + ", 면적: " + area + "]";
	}
	
	
}
