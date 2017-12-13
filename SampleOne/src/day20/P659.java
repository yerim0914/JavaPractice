package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("java01", "1234");
		p.setProperty("java02", "5234");
		p.setProperty("java05", "6234");
		System.out.println(p);
		
		System.out.println(p.getProperty("java05"));
		
		Set key = p.keySet();
		Iterator it = key.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data +":"+p.getProperty(data));
		}
		
	}
}

