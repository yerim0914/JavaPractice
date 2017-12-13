/** @author �̿���
 *  
 */

package Book.ver02;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		
		
		ArrayList<Book> data = new ArrayList<Book>();
		//data.add(new Book("Servlet", 500, "ȫ�浿"));
		//data.add(new Book("�ڹ����α׷���", 800, "���ü�"));
		//data.add(new Book("SQL",1000, "�̿���"));
		

		BookMgr bm = null;
		bm = new BookMgr();
		
		
		Scanner sc = new Scanner(System.in);
		int cmd = 0;
		String pw = null;
		System.out.println("���� ���� ���α׷��� ����Ͻ÷��� ��й�ȣ�� �Է����ּ���");
		while(true){
			pw = sc.nextLine();
			
			if(pw.equals("1234")){
				System.out.println("�α��� ����!");
				break;
			}
			System.out.println("�ٽ� �Է����ּ���.");
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
			
			System.out.println("����������������������������������������������������������");
			System.out.println("��      ���� ���� ���α׷�!!!! 	    ��");
			System.out.println("��        1. ������Ϻ���                  ��");
			System.out.println("��        2. �������                        ��");
			System.out.println("��        3. ��������                        ��");
			System.out.println("��        4. �����˻�                        ��");
			System.out.println("��      5. ���� ���Ϸ� ����        	    ��");
			System.out.println("��	 6. ���� ���� �ҷ�����          ��");
			System.out.println("��     7. ���� ������Ʈ �� ����   	    ��");
			System.out.println("��       8. ���α׷� ����         	    ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("             �� ���ϴ� ����� �Է��ϼ��� ��");
			System.out.printf("                ��ȣ �Է�: ");
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
				break;
			case 5:
				bm.filesave();
				break;
			case 6:
				bm.fileget("c://Book/book.txt");
				break;
			case 7:
				System.out.println("������ å �̸��� �Է��� �ּ���.");
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