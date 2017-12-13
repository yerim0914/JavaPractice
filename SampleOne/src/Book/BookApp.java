package Book;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BookApp {
	public static void main(String[] args) {

		Book[] data = {
				new Book("Servlet", 500, "홍길동"),
				new Book("자바프로그래밍", 800, "남궁성"),
				new Book("SQL",1000, "이예림"),
		};
		BookMgr bm = new BookMgr(data);
		Scanner sc = new Scanner(System.in);
		int cmd = 0;
		
		while (cmd != 5) {
			System.out.println("=======================");
			System.out.println("도서 정보 프로그램");
			System.out.println("1. 도서목록보기");
			System.out.println("2. 도서등록");
			System.out.println("3. 도서삭제");
			System.out.println("4. 도서검색");
			System.out.println("5. 프로그램 종료 ");
			System.out.println("=======================");
			System.out.println("원하는 명령을 입력하세요.");
			cmd = Integer.parseInt(sc.nextLine().trim());
			switch (cmd) {
			case 1:
				bm.printBookList();
				break;
			case 2:
				System.out.println("책 이름");
				String title = sc.nextLine();
				//String title = JOptionPane.showInputDialog("책 이름");
				
				System.out.println("가격");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.println("저자");
				String author = sc.nextLine();
				Book Bdata = new Book(title, price, author);
				bm.addBook(Bdata);
				System.out.println("등록된 도서정보는 다음과 같습니다.");
				System.out.println(Bdata);
				//Bdata.display();
				break;
			case 3:
				System.out.println("삭제할 책 이름을 입력해 주세요.");
				String del_data = sc.nextLine();
				bm.deleteBook(del_data);
				break;
			case 4:
				bm.searchBook();
			default:
				break;
				
			}
		}
	}
}