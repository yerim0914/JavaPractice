/* 생성자에 접근제어 */
package day12;

public class P352 {
	public static void main(String[] args) {
		
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		
	}
}
class SingleTone{
	private static SingleTone s = new SingleTone();
	
	private SingleTone(){ // 같은 클래스에서만 생성자 사용가능
		System.out.println("SingleTone() 생성");
	}
	public static SingleTone getInstance(){
		return s;
	}
}