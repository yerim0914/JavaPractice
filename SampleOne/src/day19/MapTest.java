package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>(); // Key , Value
		// Key값 중복
		map.put("java01", "1234");
		map.put("java01", "2145");
		System.out.println(map);
		// Value값 중복 가능
		map.put("java02", "1234");
		map.put("java03", "1234");
		System.out.println(map);
		//
		map.put("java04", "34561234");
		map.put("java05", "123554");
		map.put("java06", "1231234");
		map.put("java07", "128434");
		map.put("java08", "15153234");
		map.put("java09", "1212034");
		map.put("java10", "s1234");

		System.out.println(" 로그인 처리");
		Scanner sc = new Scanner(System.in);
		String id = "";
		String pw = "";
		while (true) {
			System.out.print(" ID : ");
			id = sc.nextLine();
			System.out.print(" PW : ");
			pw = sc.nextLine();
			// System.out.print("\n");
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공!");
					break;
				} else {
					System.out.println("잘못된 PassWord를 입력하셨습니다.");
				}
			} else {
				System.out.println("존재하지 않는 ID입니다.");
			}
		}
		System.out.println("===================== 서비스 목록 ======================");

		/*System.out.println(map); // 
		System.out.println(map.get("java09"));

		System.out.println(map.keySet()); // key값들만 가져와 
		*/
		Set<String> keys =map.keySet(); 
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String keyname = (String) it.next();
			System.out.println("ID :" + keyname + "PW : " + map.get(keyname));

		}

	}
}