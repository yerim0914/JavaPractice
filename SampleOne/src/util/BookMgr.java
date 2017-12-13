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
		public void addBook(Book book){ // 책 추가
			booklist[count] = book;
			count++;
		}
		public void printBookList(){
			System.out.println("=== 책 목록 ===");
			for(int i = 0; i < count; i++){
				System.out.println(booklist[i].getTitle());
			}

		}
		public void printTotalPrice(){
			System.out.println("=== 책 가격의 총합 ===");
			int PriceSum = 0;
			for(int i = 0; i < count; i++){
				PriceSum += booklist[i].getPrice();
			}
			System.out.printf("전체 책  가격의 합 : %d %n", PriceSum );
		}
}
