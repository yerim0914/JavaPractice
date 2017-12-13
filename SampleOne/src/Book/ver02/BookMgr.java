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

	public void addBook(Book data) { // 책 추가
		//equals 사용해서 중복확인
		booklist.add(data);
	}

	public void printBookList() { // 책 목록 출력
		//Collections.sort(booklist); // 정렬
		//if(booklist.size() == 0){
		//	System.out.println("책이 없습니다.");
		//}
		//else{
		for (int i = 0; i < booklist.size(); i++) {
			booklist.get(i).display();
		}
		//}
	}

	public void searchBook() { // 키보드로 입력받아서 책 검색
		int j = 0; // 찾은 권수
		System.out.println("검색할 책 이름 또는 저자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		System.out.printf("%s 의 검색결과 %n", data);
		for(Book book : booklist){
			if (book.getTitle().equals(data) || book.getTitle().equals(data)) {
				System.out.println(book);
				j++;
			}
		}
		System.out.printf("총 %d 권의 책을 찾았습니다.%n", j);
	}

	
	public void deleteBook(String data) { // 인수로 받아서 삭제
		Iterator<Book> it = booklist.iterator();
		int size = booklist.size();
		while(it.hasNext()){
			Book dat = it.next(); 
			if(dat.getTitle().equals(data)){
				it.remove();
				System.out.println(data + "책이 제거되었습니다..");
			}
		}
		if(size == booklist.size()){
			System.out.println("입력하신 책을 찾을 수 없습니다.");
		}
	}
	public void updateBook(String data){  // 책 정보 업데이트 및 수정
		for(Book book : booklist){
			if(book.getTitle().equals(data)){
				System.out.println("수정할 정보를 선택해 주세요.");
				System.out.println("1. 도서 이름, 2. 가격정보 , 3. 저자");
				Scanner sc = new Scanner(System.in); 
				switch(Integer.parseInt(sc.nextLine())){
				case 1:
					System.out.println("새로운 제목을 입력해주세요.");
					book.setTitle(sc.nextLine());
					break;
				case 2:
					System.out.println("새로운 가격 정보를 입력해주세요.");
					book.setPrice(Integer.parseInt(sc.nextLine()));
					break;
				default :
					System.out.println("새로운 저자 이름을 입력해주세요.");
					book.setAuthor(sc.nextLine());
					break;
				}	
			
			}
		}
		
	}
	public void printTitleList() { // 책 제목 출력
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
			System.out.println("파일의 책목록을 가져왔습니다.");
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 없습니다.");
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

