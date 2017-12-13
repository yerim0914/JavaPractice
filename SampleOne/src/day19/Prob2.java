package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob2 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");
		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);
		}   

	}

	private static Set<String> stringSplit(String str1, String str2) {
		String stc = "";
		Set<String> result = new HashSet<String>();
		for(int i = 0; i < str1.length(); i ++)
		{
			stc += str1.charAt(i);
			if(str1.charAt(i) == str2.charAt(0)){
				result.add(stc.substring(0,stc.length()-1));
				stc = "";
			}

		}
		/*while(){
			
		}*/
		return result;
	
	}	
}

