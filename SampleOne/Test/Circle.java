package Test;
	
public class Circle extends Shape implements A{
	
	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName() + " �������");
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() + " �׸���");
	}

	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName() + " ��ĥ�ϱ�");
	}
	
}
