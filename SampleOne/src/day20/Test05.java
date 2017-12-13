package day20;

public class Test05 {
	public static void main(String[] args) {
		//���ٽ� ������ �Լ� ���
		Command delete = ()->{
			System.out.println("delete ����");
		};
		
		Command update = ()->System.out.println("update ����");
		Command insert = ()->System.out.println("insert ����");
		Command select = ()->System.out.println("select ����");
		
		select.exec();
		delete.print();
	}
}

@FunctionalInterface //�߻� �޼ҵ尡 �ϳ��� �޼ҵ常 functional ����
interface Command{
	void exec();
	default void print(){
		System.out.println("��");
	}
}

interface A {
	void go();
	void stop();
}
class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand ����");
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