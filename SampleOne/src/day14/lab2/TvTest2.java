package day14.lab2;

public class TvTest2 {
	public static void main(String[] args) {
		Tv User = null;
		if(args[0].equals("p")){
			User = new PTV();
		}
		else if(args[0].equals("s")){
			User = new STV();
		}
		else{
			User = new LTV();
		}

		User.poweron();
		User.poweroff();
		
	}
}
interface Tv{
	void poweron();
	void poweroff();
	
}
class LTV implements Tv{
	@Override
	public void poweron(){
		System.out.println(getClass().getSimpleName() + "poweron()");
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName() + "poweroff()");
	}
}
class STV implements Tv{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName() + "poweron()");
		
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName() + "poweroff()");
		
	}
	
}
class PTV implements Tv{
	public void poweron() {
		System.out.println(getClass().getSimpleName() + "poweron()");
		
	}
	public void poweroff() {
		System.out.println(getClass().getSimpleName() + "poweroff()");
		
	}
}