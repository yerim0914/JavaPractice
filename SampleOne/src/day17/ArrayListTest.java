package day17;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		int[] i;
		String[] s;
		
		Student[] ss;
		Object[] ob;
		
		ArrayList list1 = new ArrayList(); // Object 배열 10개
		list1.add(new Student("홍길동", 23));
		list1.add("Hello java");
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		((String)list1.get(1)).toUpperCase();
		System.out.println(((String)list1.get(1)).toUpperCase());
		
		ArrayList<String> list2 = new ArrayList<String>();
		for(int j = 0; j < 100; j++){
		list2.add("test1 " + j);
		}
		list2.add(3,"~~~~");
		list2.remove(3);
		list2.remove("test1 0");
		System.out.println("위치 " + list2.indexOf("test1 1"));
		
		System.out.println(list2);
		System.out.println(list2.size());
		//System.out.println(list2.get(list2.size()-1));
		for(int j = 0; j < list2.size(); j++){
			System.out.println(list2.get(j).substring(list2.get(j).length()-2));
		}
		
	}
}
