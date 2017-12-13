package day20;

import java.util.Properties;

public class YR1 {
	public static void main(String[] args) {
		
		Properties p = new Properties();
		p.setProperty("java01","1234");
		p.put("java03",5234);
		p.put("java02",1214);
		p.put("java05",1237);
		
		System.out.println(p.get("java01"));
		System.out.println(p.getProperty("java03"));
		
	}
}
