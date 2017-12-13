package day14.lab3;

public interface Command {
	void exec();
	default void newMethod(){
		//default jdk 1.8���� ����
		System.out.println("wow");
	}
}

class Delete implements Command {
	@Override
	public void exec() {
		System.out.println("���� ��� ���� ");
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
		System.out.println("��� ��� ���� ");
	}
}

class Update implements Command {
	@Override
	public void exec() {
		System.out.println("���� ��� ���� ");
	}
}

class Select implements Command {
	@Override
	public void exec() {
		System.out.println("��Ϻ��� ��� ���� ");
	}
}