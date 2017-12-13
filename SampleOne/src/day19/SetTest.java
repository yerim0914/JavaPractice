package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		//Set<String> set = new TreeSet<String>(); // 순서 정렬
		Set<String> set = new HashSet<String>();
		set.add("java 01");
		set.add("java 09");
		set.add("java 02");
		set.add("java 03");
		set.add("java 04");
		set.add("java 05");
		
		System.out.println(set);
		set.remove("java 05");
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String data = it.next();
			System.out.println((data.substring(data.length() - 2)));
		}
		
		Iterator itt =set.iterator();
		while(itt.hasNext()){
			Object data = itt.next();
			System.out.println(data);
			
		}
		set.add("java 99");
		set.add("java 59");
		set.add("java 08");
		set.add("java 19");
		System.out.println(set);
		
	}
}
