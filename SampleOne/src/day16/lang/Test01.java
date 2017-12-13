package day16.lang;

public class Test01 {
	public static void main(String[] args) {
		
		Point p = new Point(1,1);
		System.out.println(p);
		p.close(); // null �ϱ� ���� �ڿ��ݳ�
		p = null;
		//System.gc(); // garbage collector // ���� ���X
		//finalize �� ����Ͽ� close method ���
		System.out.println("main end");
	}
}


class Point implements Cloneable{
	private int x;
	private int y;
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	protected void finalize() throws Throwable { // �Ҹ���
		// TODO Auto-generated method stub
		super.finalize();
		
	}
	void close(){
		System.out.println(getClass().getSimpleName() + "finalize() ����");
		System.out.println("�ڿ��ݳ��ڵ�");
	}
	@Override
	protected Point clone() {
		Point obj = null;
		
		
		try {
			obj = (Point)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return obj;
	}
	
	
}