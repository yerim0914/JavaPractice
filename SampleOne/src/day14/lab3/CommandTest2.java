package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		Class cls = Class.forName(args[0]);
		cmd = (Command)cls.newInstance(); //args[0] 객체를 메모리에 생성
		cmd.exec();

	}

}
