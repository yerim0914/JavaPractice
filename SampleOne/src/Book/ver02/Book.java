package Book.ver02;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable{
	private String title;
	private int price;
	private String author;
	
	public Book(){}
	public Book(String title, int price, String author) {
		this.setTitle(title);
		this.setPrice(price);
		this.setAuthor(author);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0)
			return;
		this.price = price;
	}
	public void display(){
		System.out.printf("Book[%s �� %s : %d ��] %n", author, title, price);
	}
	@Override
	public String toString() {
		StringBuilder ab = new StringBuilder();
		ab.append("Book [ ");
		ab.append(author);
		ab.append(" ������ ");
		ab.append(title);
		ab.append(" : ");
		ab.append(price);
		ab.append(" �� ]");
		
		return ab.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book){
		Book a = (Book)obj;
		if(this.title == a.title && this.price == a.price && this.author == a.author)
			return true;
		else
			return false;
		}
		else
			return false;
	}
	@Override
	public int compareTo(Book o) {
		
		return getTitle().compareTo(o.getTitle());
	}
}
