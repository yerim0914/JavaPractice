package Test;

public abstract class Shape { //��ü ���� �Ұ��� -> abstract
	protected double area;
	protected String name; //instance variable
	
	public abstract void calculationArea();
	
	@Override
	public String toString() {
		return "[" + name + ", ����: " + area + "]";
	}
	
	
}
