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
	//count를 불러올 때 b.count X -> Product.count 로 불러오기(클래스 네임으로)
	
	int serialNum;
	
	static{ // static자원을 건드리는 영역... serialNum X
		//System.out.println("static{ }");
		//serialNUm = 0;
		count = 0;
	}
	{ // 생성자 함수마다 중복되겠지 //초기화 생성자
	//	System.out.println("{}");
		++count; // 
		serialNum = count; //instance variable
	}
	public Product(){ //default 생성자
		//System.out.println("Product() 기본 생성자");
	}

}
