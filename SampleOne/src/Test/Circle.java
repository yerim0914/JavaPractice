package Test;
	
public class Circle extends Shape implements A{
	
	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName() + " 면적계산");
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() + " 그리기");
	}

	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName() + " 색칠하기");
	}
	
}
