package day11;

public class AnimalTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
		
		Dog d1 = new Dog("진돗개","백구");
		d1.display();
		Dog d2 = new Dog("강아지과", "진돗개", "백구");
		d2.display();
	}
}
