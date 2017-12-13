package util;
/**
 * 
 * @author student
 *
 */
public class Account {
	String num; // ����
	String name;
	int money; //�ܰ�
	
	public Account(){
		this("�̸�","000",0);
	}
	public Account(String name, String num, int money){
		this.num   = num;
		this.money = money;
		this.name  = name;
	}
	public void deposit(int m)
	{
		money += m;
		System.out.println("��� " + m + "�ܰ� " + this.money);
	}
	public void withdraw(int m)
	{
		if(money < m)
		{
			System.out.println("==�ܰ����==");
			System.out.println("������ü ����");
			return ;
		}
		money -=m;
		System.out.println("��� " + m + "�ܰ� " + this.money);
	}
	public void transfer(Account acc, int money) // ������ü
	{
		//this.money -= money;
		//acc.money  += money;

		if(this.money < money){
			System.out.println("==�ܰ����==");
			System.out.println("������ü ����");
			return;
		}
		System.out.println("��� ���� ����");
		display();
		System.out.println("�Ա� ���� ����");
		acc.display();
		withdraw(money);
		acc.deposit(money);
		System.out.println("========������ü �Ϸ�!========");
		display();
		acc.display();
	}
	public void transfer(Account from, Account to, int money) // ������ü
	{
		//this.money -= money;
		//acc.money  += money;
		if(to == null){
			System.out.println("�������� Ȯ���ϼ���");
			return;
		}
		if(from.money < money){
			System.out.println("==�ܰ����==");
			System.out.println("������ü ����");
			return;
		}
		System.out.println("��� ���� ����");
		from.display();
		System.out.println("�Ա� ���� ����");
		to.display();
		from.withdraw(money);
		to.deposit(money);
		System.out.println("========������ü �Ϸ�!========");
		from.display();
		to.display();
	}
	public void display()
	{
		System.out.printf("%s������ %s �� ���� �ܰ�� %d �� �Դϴ�.%n", name, num, money);
	}
	
}
class Customer{
	String number;
	String name;
}

/*=================����  �ϼ���  Account_�̸� =======================
Account Ŭ����
    ���¹�ȣ  , �ܰ�  , �Ա� , ���, ������ü, �����������
*/