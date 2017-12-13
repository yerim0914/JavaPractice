package day14;

import java.util.Vector;

class Product {
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
	Product(){
		price = 0;
		bonuspoint = 0;
	}
}
class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString(){
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString(){
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString(){
		return "Audio";
	}
}
class Buyer{
	int money = 1000;
	int bonuspoint = 0;
	Vector item = new Vector();
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		item.add(p);
		System.out.println(p + " 를 구입하셨습니다.");
	}
	void refund(Product p){
		if(item.remove(p)){
			money += p.price;
			bonuspoint -= p.bonuspoint;
			System.out.println(p + " 를 반품하셨습니다.");
		}
		else{
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary(){
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()){
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		for(int i = 0; i < item.size(); i++){
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0)? ""+ p : "," + p;
		}
		System.out.println("구입금액: " + sum + " 만원");
		System.out.println("구입제품: " + itemList );
	}
	
}
