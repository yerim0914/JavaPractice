package day11;

public class Animal {
	
	private String kind = "������ ����"; 
	
	
	public Animal() {
		System.out.println("Animal() ����");
	}
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void breath(){
		System.out.println("��� ������");
	}
	
}
