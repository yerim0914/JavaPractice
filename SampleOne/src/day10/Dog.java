package day10;

public class Dog extends Animal{
	String name;
	String kind = "������ ����";
	public void bike(){
		System.out.println("bike~~~~");
	}
	public void display(){
		System.out.printf("Dog[%s %s %s]%n", super.kind, this.kind, this.name);
	}//super main���� ������
}
