package day11;

public class Test2 {

	public static void main(String[] args) {
		Fish f = new Fish();
		
		f.display();
		
		f = new Fish("����");
		f = new Fish("������", "����");
		f.display();
		
		f.breath();
		
	}

}
