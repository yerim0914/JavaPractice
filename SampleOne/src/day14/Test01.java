package day14;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		BB b = new BB();
		
		A[] aaa = {new AA(), new BB()};
		B[] bbb = {new AA(), new BB()};
		C[] ccc = {new AA(), new BB()};
		I[] iii = {new AA(), new BB()};
		
		for(int i = 0; i < aaa.length; i++){
			aaa[i].a();
			bbb[i].b();
			ccc[i].c();
			iii[i].a();
			iii[i].b();
			iii[i].c();
			
		}
	}

}
class AA extends Object implements I{ 

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
}
class BB extends Object implements I{

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
}
interface I extends A, B, C{
	
}
interface A{
	void a();
}
interface B{
	void b();
}
interface C{
	void c();
}