package day11;

public class Test2 {

	public static void main(String[] args) {
		Fish f = new Fish();
		
		f.display();
		
		f = new Fish("구피");
		f = new Fish("물고기과", "구피");
		f.display();
		
		f.breath();
		
	}

}
