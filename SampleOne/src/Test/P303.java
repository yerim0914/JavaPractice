package Test;

public class P303 {
	public static void main(String[] args) {
		System.out.println("start");
		Product b1 = new Product();
		Product b2 = new Product();
		Product b3 = new Product();
		
		System.out.println(b1.serialNum);
		System.out.println(b2.serialNum);
		System.out.println(b3.serialNum);
		
		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);
		System.out.println(Product.count);
		
		System.out.println("end");
	}
}
class Product{
	static int count = 0; //static variable = class variable 
	//count�� �ҷ��� �� b.count X -> Product.count �� �ҷ�����(Ŭ���� ��������)
	
	int serialNum;
	
	static{ // static�ڿ��� �ǵ帮�� ����... serialNum X
		//System.out.println("static{ }");
		//serialNUm = 0;
		count = 0;
	}
	{ // ������ �Լ����� �ߺ��ǰ��� //�ʱ�ȭ ������
	//	System.out.println("{}");
		++count; // 
		serialNum = count; //instance variable
	}
	public Product(){ //default ������
		//System.out.println("Product() �⺻ ������");
	}

}
