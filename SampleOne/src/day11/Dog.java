package day11;

public class Dog extends Animal{
	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		super();
	}
	public Dog(String kind, String name) {
		super();
		this.kind = kind;
		this.name = name;
	}
	public Dog(String superk, String kind, String name) {
		super(superk);
		this.kind = kind;
		this.name = name;
	}
	public void display(){
		System.out.printf("Dog [%s %s %s]%n",super.getKind(), kind, name);
	}
	
	
}
