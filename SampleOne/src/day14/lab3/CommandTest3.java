package day14.lab3;

public class CommandTest3 {
	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		cmd = new day14.lab3.Delete();
		
		Class cls = Class.forName("day14.lab3.Delete");
		cmd = (Command)cls.newInstance(); //args[0] 객체를 메모리에 생성
		cmd.exec();
		
		
	}
}
