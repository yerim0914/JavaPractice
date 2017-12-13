/** @author 이예림
 *  
 */

package Book.ver02;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		
		
		ArrayList<Book> data = new ArrayList<Book>();
		//data.add(new Book("Servlet", 500, "홍길동"));
		//data.add(new Book("자바프로그래밍", 800, "남궁성"));
		//data.add(new Book("SQL",1000, "이예림"));
		

		BookMgr bm = null;
		bm = new BookMgr();
		
		
		Scanner sc = new Scanner(System.in);
		int cmd = 0;
		String pw = null;
		System.out.println("도서 정보 프로그램을 사용하시려면 비밀번호를 입력해주세요");
		while(true){
			pw = sc.nextLine();
			
			if(pw.equals("1234")){
				System.out.println("로그인 성공!");
				break;
			}
			System.out.println("다시 입력해주세요.");
		}
		while (cmd != 8) {
			Th_save s = new Th_save();
			Thread th = new Thread(s);
			th.setDaemon(true);
			th.start();
			s.autoSave = true;
				
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("┌───────────────────────────┐");
			System.out.println("│      도서 정보 프로그램!!!! 	    │");
			System.out.println("│        1. 도서목록보기                  │");
			System.out.println("│        2. 도서등록                        │");
			System.out.println("│        3. 도서삭제                        │");
			System.out.println("│        4. 도서검색                        │");
			System.out.println("│      5. 도서 파일로 저장        	    ♥");
			System.out.println("│	 6. 도서 파일 불러오기          ♥");
			System.out.println("│     7. 도서 업데이트 및 수정   	    │");
			System.out.println("│       8. 프로그램 종료         	    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("             ※ 원하는 명령을 입력하세요 ※");
			System.out.printf("                번호 입력: ");
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
				break;
			case 5:
				bm.filesave();
				break;
			case 6:
				bm.fileget("c://Book/book.txt");
				break;
			case 7:
				System.out.println("수정할 책 이름을 입력해 주세요.");
				String modi_data = sc.nextLine();
				bm.updateBook(modi_data);
				break;
			default:
				break;
				
			}
		}
	}
	}

class Th_save implements Runnable{
	static boolean autoSave = false;
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) { }
			if(autoSave){
				try {
					//BookMgr BM = new BookMgr();
					//BM.filesave();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}