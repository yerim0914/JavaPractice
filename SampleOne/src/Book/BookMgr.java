package Book;

import java.util.Scanner;

public class BookMgr {
	private int count = 0;
	private Book[] booklist = new Book[1000];

	public BookMgr() {
	}
	public BookMgr(Book[] data) {
		System.arraycopy(data, 0, booklist, count, data.length);
		count = count + data.length;
	}

	public void addBook(Book data) { // 책 추가
		//equals 사용해서 중복확인
		booklist[count] = data;
		count++;
	}

	public void printBookList() { // 책 목록 출력
		for (int i = 0; i < count; i++) {
			booklist[i].display();
		}
	}

	public void searchBook() { // 키보드로 입력받아서 책 검색
		int j = 0; // 찾은 권수
		System.out.println("검색할 책 이름 또는 저자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		System.out.printf("%s 의 검색결과 %n", data);
		for (int i = 0; i < count; i++) {
			if (booklist[i].getTitle().equals(data) || booklist[i].getAuthor().equals(data)) {
				System.out.println(booklist[i].toString());
				j++;
			}
		}
		System.out.printf("총 %d 권의 책을 찾았습니다.%n", j);
	}

	public void searchBook(String data) { // 인수로 받아서 검색
		int j = 0; // 찾은 권수
		System.out.printf("%s 의 검색결과 %n", data);
		for (int i = 0; i < count; i++) {
			if (booklist[i].getTitle() == data || booklist[i].getAuthor() == data) {
				System.out.println(booklist[i].toString());
				j++;
			}
		}
		System.out.printf("총 %d 권의 책을 찾았습니다.%n", j);
	}

	public void deleteBook(String data) { // 인수로 받아서 삭제
		for (int i = 0; i < count; i++) {
			if (booklist[i].getTitle().equals(data)) {
				// for(int j = i; j < count; j++)
				System.arraycopy(booklist, i + 1, booklist, i, count - i);
				// booklist[j] = booklist[j+1];
				count--;
				// break;
			}
		}
	}

	public void printTitleList() { // 책 제목 출력
		for (int i = 0; i < count; i++) {
			booklist[i].getTitle();
		}
	}
}
