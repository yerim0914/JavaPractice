package util;
/**
 * 
 * @author student
 *
 */
public class Account {
	String num; // 계좌
	String name;
	int money; //잔고
	
	public Account(){
		this("이름","000",0);
	}
	public Account(String name, String num, int money){
		this.num   = num;
		this.money = money;
		this.name  = name;
	}
	public void deposit(int m)
	{
		money += m;
		System.out.println("출금 " + m + "잔고 " + this.money);
	}
	public void withdraw(int m)
	{
		if(money < m)
		{
			System.out.println("==잔고부족==");
			System.out.println("계좌이체 종료");
			return ;
		}
		money -=m;
		System.out.println("출금 " + m + "잔고 " + this.money);
	}
	public void transfer(Account acc, int money) // 계좌이체
	{
		//this.money -= money;
		//acc.money  += money;

		if(this.money < money){
			System.out.println("==잔고부족==");
			System.out.println("계좌이체 종료");
			return;
		}
		System.out.println("출금 계좌 정보");
		display();
		System.out.println("입금 계좌 정보");
		acc.display();
		withdraw(money);
		acc.deposit(money);
		System.out.println("========계좌이체 완료!========");
		display();
		acc.display();
	}
	public void transfer(Account from, Account to, int money) // 계좌이체
	{
		//this.money -= money;
		//acc.money  += money;
		if(to == null){
			System.out.println("계좌정보 확인하세요");
			return;
		}
		if(from.money < money){
			System.out.println("==잔고부족==");
			System.out.println("계좌이체 종료");
			return;
		}
		System.out.println("출금 계좌 정보");
		from.display();
		System.out.println("입금 계좌 정보");
		to.display();
		from.withdraw(money);
		to.deposit(money);
		System.out.println("========계좌이체 완료!========");
		from.display();
		to.display();
	}
	public void display()
	{
		System.out.printf("%s고객님의 %s 에 현재 잔고는 %d 원 입니다.%n", name, num, money);
	}
	
}
class Customer{
	String number;
	String name;
}

/*=================제출  하세요  Account_이름 =======================
Account 클래스
    계좌번호  , 잔고  , 입금 , 출금, 계좌이체, 통장정보출력
*/