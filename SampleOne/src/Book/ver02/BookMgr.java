package Book.ver02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class BookMgr {
	private List<Book> booklist = new ArrayList<Book>();
	
	public BookMgr(){}
	public BookMgr(ArrayList<Book> data) {
		/*for(int i = 0; i < data.size(); i++)
		booklist.add(i, data.get(i));*/
		Arrays.asList(data);
		booklist.addAll(data);
	}

	public void addBook(Book data) { // å �߰�
		//equals ����ؼ� �ߺ�Ȯ��
		booklist.add(data);
	}

	public void printBookList() { // å ��� ���
		//Collections.sort(booklist); // ����
		//if(booklist.size() == 0){
		//	System.out.println("å�� �����ϴ�.");
		//}
		//else{
		for (int i = 0; i < booklist.size(); i++) {
			booklist.get(i).display();
		}
		//}
	}

	public void searchBook() { // Ű����� �Է¹޾Ƽ� å �˻�
		int j = 0; // ã�� �Ǽ�
		System.out.println("�˻��� å �̸� �Ǵ� ���ڸ� �Է��� �ּ���.");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		System.out.printf("%s �� �˻���� %n", data);
		for(Book book : booklist){
			if (book.getTitle().equals(data) || book.getTitle().equals(data)) {
				System.out.println(book);
				j++;
			}
		}
		System.out.printf("�� %d ���� å�� ã�ҽ��ϴ�.%n", j);
	}

	
	public void deleteBook(String data) { // �μ��� �޾Ƽ� ����
		Iterator<Book> it = booklist.iterator();
		int size = booklist.size();
		while(it.hasNext()){
			Book dat = it.next(); 
			if(dat.getTitle().equals(data)){
				it.remove();
				System.out.println(data + "å�� ���ŵǾ����ϴ�..");
			}
		}
		if(size == booklist.size()){
			System.out.println("�Է��Ͻ� å�� ã�� �� �����ϴ�.");
		}
	}
	public void updateBook(String data){  // å ���� ������Ʈ �� ����
		for(Book book : booklist){
			if(book.getTitle().equals(data)){
				System.out.println("������ ������ ������ �ּ���.");
				System.out.println("1. ���� �̸�, 2. �������� , 3. ����");
				Scanner sc = new Scanner(System.in); 
				switch(Integer.parseInt(sc.nextLine())){
				case 1:
					System.out.println("���ο� ������ �Է����ּ���.");
					book.setTitle(sc.nextLine());
					break;
				case 2:
					System.out.println("���ο� ���� ������ �Է����ּ���.");
					book.setPrice(Integer.parseInt(sc.nextLine()));
					break;
				default :
					System.out.println("���ο� ���� �̸��� �Է����ּ���.");
					book.setAuthor(sc.nextLine());
					break;
				}	
			
			}
		}
		
	}
	public void printTitleList() { // å ���� ���
		for (int i = 0; i < booklist.size(); i++) {
			booklist.get(i).getTitle();
		}
	}
	public void filesave() {
		String FileName = "c://Book/book.obj";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(FileName);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(booklist);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
				try {
					if(oos != null) oos.close();
					if(bos != null) bos.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
	}

	public void fileget(String filename) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			obj = ois.readObject();
		
			booklist = (List<Book>) obj;
			System.out.println(booklist.size());
			System.out.println("������ å����� �����Խ��ϴ�.");
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("������ �����ϴ�.");
		} catch (Exception e){
			e.printStackTrace();
		} finally {
				try {
					if(ois != null) ois.close();
					if(bis != null) bis.close();
					if(fis != null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	}
}

