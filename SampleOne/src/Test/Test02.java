// �������̽����� ��ӽ��Ѽ� ���� 

package Test;

public class Test02 {

	public static void main(String[] args) {
		Shape[] ss = {
				new Circle(),
				new Rectangle()
			};
			for(int i = 0; i < ss.length; i++){
				ss[i].calculationArea();
				((A)ss[i]).draw();
				((A)ss[i]).drawColor();

			}
	}

}
