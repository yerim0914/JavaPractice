package day15;

public class Test04 {
	public static void main(String[] args) {
			
		Account a = new Account();
		try {
			a.setMoney(-100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Account b = new Account("dd",-100);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
		
	}
}
class Account{
	String name;
	int money;
	
	public Account() {
		super();
	}
	public Account(String name, int money) throws Exception {
		super();
		this.name = name;	
		setMoney(money);

	}
	public void setMoney(int money) throws Exception {
		if(money < 0){
			throw new Exception("money error");
		}
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
}
