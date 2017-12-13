package util;

public class BookMgr {
		public Book[] booklist;
		int count = 0;
		public BookMgr(){
			booklist = new Book[1000];
		}
		public BookMgr(Book[] booklist) {
			this.booklist = booklist;
		}
		public void addBook(Book book){ // å �߰�
			booklist[count] = book;
			count++;
		}
		public void printBookList(){
			System.out.println("=== å ��� ===");
			for(int i = 0; i < count; i++){
				System.out.println(booklist[i].getTitle());
			}

		}
		public void printTotalPrice(){
			System.out.println("=== å ������ ���� ===");
			int PriceSum = 0;
			for(int i = 0; i < count; i++){
				PriceSum += booklist[i].getPrice();
			}
			System.out.printf("��ü å  ������ �� : %d %n", PriceSum );
		}
}
