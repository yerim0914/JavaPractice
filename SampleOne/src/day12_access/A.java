package day12_access;

public class A { 
	public String name1 = "A"; // public �ٸ� ��Ű�������� ����
	protected String name2 = "A";  
	String name3 = "A"; // ���� ��Ű�� ����
	private String name4 = "A"; // ���� Ŭ���� ��������
	
	
}
class B { // �ٸ� ��Ű�� ���� ���X
	A a;
	void print(){
		System.out.println();
	}
}
