package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileCompareUtil {

	public static void main(String[] args) {
		FileCompareUtil A = new FileCompareUtil();
		String first_fileName = "C:/first.txt";
		String second_fileName = "C:/second.txt";
		ArrayList<String> s;
		try {
			s = A.compareFile(first_fileName, second_fileName);
			for (int i = 0; i < s.size(); i++) {
				System.out.printf("LINE %d %s \n", i + 1, s.get(i).toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
		ArrayList<String> result = new ArrayList<String>();

		BufferedReader br_first = null;
		BufferedReader br_second = null;
		FileReader fr_first = null;
		FileReader fr_second = null;

		fr_first = new FileReader(fstFileName);
		fr_second = new FileReader(scdFileName);

		br_first = new BufferedReader(fr_first);
		br_second = new BufferedReader(fr_second);

		String first_read = null;
		String second_read = null;
		while ((first_read = br_first.readLine()) != null) {
			second_read = br_second.readLine();
			if (!first_read.equals(second_read)) {
				result.add(second_read);
			}
		}

		return result;
	}
}
