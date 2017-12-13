package day14.lab1;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LTV user = new LTV();
			user.on();
			user.off();
			
			STV user1 = new STV();
			user1.poweron();
			user1.poweroff();
			//user = new STV();
			
	}

}
class LTV{
	void on(){
		System.out.println("LTV on");
	}
	void off(){
		System.out.println("LTV off");
	}
	
}
class STV{
	void poweron(){
		System.out.println("STV on");
	}
	void poweroff(){
		System.out.println("STV off");
	}
}
