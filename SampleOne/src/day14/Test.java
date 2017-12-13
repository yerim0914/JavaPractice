package day14;

class Test{
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		//Audio audi = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.summary();
	}
}