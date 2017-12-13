package util;

public class Book {
	private String title;
	private int price;
	
	public Book(){}
	public Book(String title, int price) { //»ý¼ºÀÚ
		this.setTitle(title);
		this.setPrice(price);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title == null)
			return;
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price == 0)
			return;
		this.price = price;
	}
}
