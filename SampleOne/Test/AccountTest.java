package Test;

import util.Account;
public class AccountTest {
	public static void main(String[] args) {
		Account A1 = new Account("이예림", "001", 99999990);
		Account A2 = new Account("이길동", "002", 500000);
		
		A1.deposit(5000);
		A1.withdraw(99999999);
		A2 = null;
		A1.transfer(A1, A2, 8000);
		
	}
}
