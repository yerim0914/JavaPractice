package day20;

import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) {
		Prob1 p= new Prob1();
		String[] datas = {"1", "2", "3", "4", "5"};
		System.out.print(p.moveToVector(datas));	
	}
	Vector<String> moveToVector(String datas[]){
		if(datas == null || datas.length == 0){
			System.out.println("처리할 데이터가 필요합니다.");
			return null;
		}
		Vector<String> data = new Vector<>();
		for(int i = 0; i < datas.length; i++)
		data.add(datas[datas.length - i - 1]);
	
		return data;
	}
}

