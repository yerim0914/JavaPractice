package day12_access;

public class A { 
	public String name1 = "A"; // public 다른 패키지에서도 사용됨
	protected String name2 = "A";  
	String name3 = "A"; // 같은 패키지 영역
	private String name4 = "A"; // 같은 클래스 내에서만
	
	
}
class B { // 다른 패키지 영역 사용X
	A a;
	void print(){
		System.out.println();
	}
}
