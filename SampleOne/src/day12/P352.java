/* �����ڿ� �������� */
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
	
	private SingleTone(){ // ���� Ŭ���������� ������ ��밡��
		System.out.println("SingleTone() ����");
	}
	public static SingleTone getInstance(){
		return s;
	}
}