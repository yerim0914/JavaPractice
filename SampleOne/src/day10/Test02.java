package day10;

public class Test02 {

	public static void main(String[] args) {
		Fish f = new Fish();
		f.breathe();
		
		Animal ff = new Fish();
		System.out.println(ff.kind);
		ff.breathe();
		//ff.name; ¿À·ù

	}

}
