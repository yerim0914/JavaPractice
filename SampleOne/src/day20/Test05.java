package day20;

public class Test05 {
	public static void main(String[] args) {
		//람다식 변수에 함수 등록
		Command delete = ()->{
			System.out.println("delete 수행");
		};
		
		Command update = ()->System.out.println("update 수행");
		Command insert = ()->System.out.println("insert 수행");
		Command select = ()->System.out.println("select 수행");
		
		select.exec();
		delete.print();
	}
}

@FunctionalInterface //추상 메소드가 하나인 메소드만 functional 가능
interface Command{
	void exec();
	default void print(){
		System.out.println("★");
	}
}

interface A {
	void go();
	void stop();
}
class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수정");
	}
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand ");
	}
}
class SelectCommand implements Command{
	@Override
	public void exec() {
		System.out.println("SelectCommand ");
	}
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("InsertCommand ");
	}
}