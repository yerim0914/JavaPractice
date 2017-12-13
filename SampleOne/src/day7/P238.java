package day7;


public class P238 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.display();
		tv1.power();

		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();

		tv1.display();
	}
	TV tv2 = new TV();
	
}
class TV{
	String color;
	boolean power = false;
	int channel;
	int volume;
	
	void power(){
		this.power = !power;
	}
	void channelUp(){
		++this.channel;
	}
	void channelDown(){
		--this.channel;
	}
	void volumeUp(){
		++volume;
	}
	void volumeDown(){
		--volume;
	}
	void display()
	{
		System.out.println("channel: "+channel);
	}
	
}