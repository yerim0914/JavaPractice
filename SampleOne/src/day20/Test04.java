package day20;

public class Test04 {
	public static void main(String[] args) {
		//Anonymous Class !!!!!!!!
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~ delete 수행");
			}
		};
		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~ update 수행");
			}
		};
		Command select = new Command(){
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~~ select 수행");
			}
			
		};
		Command insert = new Command(){
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~ insert 수행");
			}
			
		};
		
		
		insert.exec();
		delete.exec();
		update.exec();
		select.exec();
		
		
		
	}
}
