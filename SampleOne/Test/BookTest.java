package Test;

import util.Book;
import util.BookMgr;

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book("Java" , 1000);
		Book b2 = new Book("Jsp", 2000);
		Book b3 = new Book("SQL", 3000);
		Book b4 = new Book("JDBC", 5000);
		Book b5 = new Book("EJB", 10000);
		
		BookMgr a = new BookMgr();
		
		//System.out.println(b1.getTitle());
		a.addBook(b1);
		a.addBook(b2);
		a.addBook(b3);
		a.addBook(b4);
		a.addBook(b5);
		
		
		
		a.printBookList();
		a.printTotalPrice();
		
	}

	

}
