package day14.lab3;

public class CommandTest {

	public static void main(String[] args) {
		Command cmd = null;

		if (args[0].equals("delete")) {
			cmd = new Delete();
		} else if (args[0].equals("insert")) {
			cmd = new Insert();
		} else {
			cmd = new Update();
		}
		//��� Ȯ�� �����
		cmd.exec();
		cmd.newMethod();
	}

}
