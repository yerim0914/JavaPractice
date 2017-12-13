/* 상속 */
package day10;

public class Test01 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breathe();
		
		System.out.println(a1.kind);
		System.out.println("==================================");
		
		Dog d = new Dog();
		d.breathe();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind);
		d.display();
		System.out.println("==================================");
		
		//is a 관계
	
		Animal e = new Dog();
		//e.bike(); e.name; 안됨
		((Dog)e).bike();
		((Dog)e).display();
		e.breathe();
		System.out.println(e.kind);

		System.out.println("==================================");
		
		Fish f = new Fish();
		Fish ff = new Fish();
		((Animal)ff).breathe();
		
		
		
		
		
	}
}
