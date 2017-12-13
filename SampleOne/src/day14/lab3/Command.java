package day14.lab3;

public interface Command {
	void exec();
	default void newMethod(){
		//default jdk 1.8부터 제공
		System.out.println("wow");
	}
}

class Delete implements Command {
	@Override
	public void exec() {
		System.out.println("삭제 기능 수행 ");
	}
	@Override
	public void newMethod() {
		Command.super.newMethod();
		System.out.println("+++++");
	}
}

class Insert implements Command {
	@Override
	public void exec() {
		System.out.println("등록 기능 수행 ");
	}
}

class Update implements Command {
	@Override
	public void exec() {
		System.out.println("수정 기능 수행 ");
	}
}

class Select implements Command {
	@Override
	public void exec() {
		System.out.println("목록보기 기능 수행 ");
	}
}