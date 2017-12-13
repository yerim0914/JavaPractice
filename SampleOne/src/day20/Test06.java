package day20;

public class Test06 {
	public static void main(String[] args) {
		
		F1 f = new F1(){
			@Override
			public int max(int a, int b) {
				return (a > b)? a:b ;
			}
		};
		System.out.println(f.max(44, 99));
		F1 f2 = (int a, int b)-> (a > b)? a:b ;
		System.out.println(f2.max(4, 9));
		
		F2 f3 = (double a, double b)-> {
			return (a < b)? a: b;
		};
		System.out.println(f3.min(3.9, 10.1));
 	}
}
@FunctionalInterface // 꼭 메소드 하나는 있어야지이
interface F1{
	int max(int a, int b);
}
@FunctionalInterface // 함수형 인터페이스 확인
interface F2{
	double min(double a, double b);
}