package Test;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculationArea();
		c.draw();
		c.drawColor();
		
		Rectangle r = new Rectangle();
		r.calculationArea();
		r.draw();
		r.drawColor();
		
		Shape s = c;
		s.calculationArea();
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(r);
		
		Drawable d = c;
		d.draw();
		System.out.println("====================");
		Shape[] ss = {
			new Circle(),
			new Rectangle()
		};
		for(int i = 0; i < ss.length; i++){
			ss[i].calculationArea();
			((Drawable)ss[i]).draw();
			((Colorable)ss[i]).drawColor();
		}
		
	}
}
