package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		Class cls = Class.forName(args[0]);
		cmd = (Command)cls.newInstance(); //args[0] ��ü�� �޸𸮿� ����
		cmd.exec();

	}

}
