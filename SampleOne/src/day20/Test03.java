package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("delete , update, select, insert 중 하나를 입력해주세요.");
		}

		Map<String, Command> cmd = new HashMap<>();
		cmd.put("delete", new DeleteCommand());
		cmd.put("update", new UpdateCommand());
		cmd.put("select", new SelectCommand());
		cmd.put("insert", new InsertCommand());
		
		Command command = cmd.get(args[0]);
		if(command == null) {
			System.out.println(args[0] + "지원되지 않습니다.");
		}
		command.exec();
		
		
	}
}
