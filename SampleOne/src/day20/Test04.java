package day20;

public class Test04 {
	public static void main(String[] args) {
		//Anonymous Class !!!!!!!!
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~ delete 荐青");
			}
		};
		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~ update 荐青");
			}
		};
		Command select = new Command(){
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~~ select 荐青");
			}
			
		};
		Command insert = new Command(){
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~ insert 荐青");
			}
			
		};
		
		
		insert.exec();
		delete.exec();
		update.exec();
		select.exec();
		
		
		
	}
}
