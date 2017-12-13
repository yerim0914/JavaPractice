package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Prob1 {
	public static void main(String[] args) {
		String fstFileName = "c://resource/First.txt";
		String scdFileName = "c://resource/Second.txt";
		
		FileCompareUtil cmp = new FileCompareUtil();

		ArrayList<String> result = new ArrayList<String>();
		try {
			result = cmp.compareFile(fstFileName, scdFileName);
			for(int i = 0; i < result.size(); i++){
				System.out.println(result.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

