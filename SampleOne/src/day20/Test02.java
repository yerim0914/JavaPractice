package day20;

public class Test02 {
	public static void main(String[] args) {
		
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		
		if(args.length == 0){
			System.out.println("delete , update, select, insert 중 하나를 입력해주세요.");
		}
		if(args[0].equals("delete")){
			delete.exec();
		}else if(args[0].equals("update")){
			update.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else if(args[0].equals("insert")){
			insert.exec();
		}else{
			System.out.println("지원이 안됩니다.");
		}
		System.out.println("Main End");
		
	}
}
