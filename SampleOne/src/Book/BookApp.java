package Book;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BookApp {
	public static void main(String[] args) {

		Book[] data = {
				new Book("Servlet", 500, "ȫ�浿"),
				new Book("�ڹ����α׷���", 800, "���ü�"),
				new Book("SQL",1000, "�̿���"),
		};
		BookMgr bm = new BookMgr(data);
		Scanner sc = new Scanner(System.in);
		int cmd = 0;
		
		while (cmd != 5) {
			System.out.println("=======================");
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ������Ϻ���");
			System.out.println("2. �������");
			System.out.println("3. ��������");
			System.out.println("4. �����˻�");
			System.out.println("5. ���α׷� ���� ");
			System.out.println("=======================");
			System.out.println("���ϴ� ����� �Է��ϼ���.");
			cmd = Integer.parseInt(sc.nextLine().trim());
			switch (cmd) {
			case 1:
				bm.printBookList();
				break;
			case 2:
				System.out.println("å �̸�");
				String title = sc.nextLine();
				//String title = JOptionPane.showInputDialog("å �̸�");
				
				System.out.println("����");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.println("����");
				String author = sc.nextLine();
				Book Bdata = new Book(title, price, author);
				bm.addBook(Bdata);
				System.out.println("��ϵ� ���������� ������ �����ϴ�.");
				System.out.println(Bdata);
				//Bdata.display();
				break;
			case 3:
				System.out.println("������ å �̸��� �Է��� �ּ���.");
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