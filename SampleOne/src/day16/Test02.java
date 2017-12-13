package day16;

public class Test02 {
	public static void main(String[] args) {
		try{
		Account account = new Account("È«È«È«", 100);
		account.setMoney(-500);
		System.out.println(account);
		}
		catch(MoneyException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
		
	}
}
class Account{
	private String name;
	private int money;
	
	public Account() {
		super();
	}
	public Account(String name, int money) throws MoneyException {
		super();
		this.name = name;
		this.setMoney(money);
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) throws MoneyException {
		if(money < 0){
			throw new MoneyException("money´Â ¾ç¼ö¸¸");
		}
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [name= b" + name + ", money= " + money + "]";
	}
	
}
class MoneyException extends Exception{
	MoneyException(){
		super("Money Error");
	}
	MoneyException(String msg){
		super(msg);
	}
}

