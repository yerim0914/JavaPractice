package day7;

public class Prob2 {
	public static String leftPad(String str, int size, char padChar) {
		//Sol 1
		/*char[] a = new char[size];
		for(int i = 0; i < size; i++)
		{
			a[i] = (i<str.length())? padChar:str.charAt(i - str.length()); 
		}
		return String.copyValueOf(a);
		*/
		//Sol 2
		/*if(str.length() <= size)
		{
			char[] a = new char[size-str.length()];
			for(int i = 0; i < (size-str.length()); i++)
				a[i] = padChar;
			String b = String.copyValueOf(a);
			return b + str;
		}
		else{
			return str;
		}*/
		//Sol 3
		String a ="";
		for(int i = 0; i < size - str.length(); i++)
		{
			a += padChar;
		}
		a += str;
		return a;
	}
	public static void main(String[] args){
		System.out.println(leftPad("SDS", 7, '!'));
		
	}
}
