package day15;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("Start");
		try{
			System.out.println("try{");
			System.out.println(args[0].length()); //args ������ ���⼭ ���� �߻�, ������
			int num = Integer.parseInt(args[0]);  
			System.out.println(10/num);
			System.out.println("}");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("������ �� ���� �迭 �ε��� ���");
		}
		catch(NumberFormatException e){
			System.out.println("���ڷ� �Է��� �ּ���");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println("�ڿ� �ݳ��� ���⿡");
		}
		System.out.println("End");
	}
}
