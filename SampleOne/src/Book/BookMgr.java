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

	public void addBook(Book data) { // å �߰�
		//equals ����ؼ� �ߺ�Ȯ��
		booklist[count] = data;
		count++;
	}

	public void printBookList() { // å ��� ���
		for (int i = 0; i < count; i++) {
			booklist[i].display();
		}
	}

	public void searchBook() { // Ű����� �Է¹޾Ƽ� å �˻�
		int j = 0; // ã�� �Ǽ�
		System.out.println("�˻��� å �̸� �Ǵ� ���ڸ� �Է��� �ּ���.");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		System.out.printf("%s �� �˻���� %n", data);
		for (int i = 0; i < count; i++) {
			if (booklist[i].getTitle().equals(data) || booklist[i].getAuthor().equals(data)) {
				System.out.println(booklist[i].toString());
				j++;
			}
		}
		System.out.printf("�� %d ���� å�� ã�ҽ��ϴ�.%n", j);
	}

	public void searchBook(String data) { // �μ��� �޾Ƽ� �˻�
		int j = 0; // ã�� �Ǽ�
		System.out.printf("%s �� �˻���� %n", data);
		for (int i = 0; i < count; i++) {
			if (booklist[i].getTitle() == data || booklist[i].getAuthor() == data) {
				System.out.println(booklist[i].toString());
				j++;
			}
		}
		System.out.printf("�� %d ���� å�� ã�ҽ��ϴ�.%n", j);
	}

	public void deleteBook(String data) { // �μ��� �޾Ƽ� ����
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

	public void printTitleList() { // å ���� ���
		for (int i = 0; i < count; i++) {
			booklist[i].getTitle();
		}
	}
}
