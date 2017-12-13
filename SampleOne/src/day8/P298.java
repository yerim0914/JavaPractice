package day8;

import java.util.Arrays;

public class P298 {

	public static void main(String[] args) {
		Car c1 = new Car("Red", 3, "Auto");
		Car c2 = c1; // c1의 주소를 공유
		Car c3 = new Car(c1); //복사본
		
		c1.color = "Gray";
		
		c1.display();
		c2.display();
		c3.display();
		
		
		int a[] = {1,2,3};
		int b[] = new int[10];
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(Arrays.toString(b));
	}
}
	class Car{
		String color;
		int door;
		String gearType;
		
		Car(){
		}
		Car(String color, int door, String gearType)
		{
		this.color    = color;
		this.door     = door;
		this.gearType = gearType;
		}
		Car(Car c){
			this(c.color, c.door, c.gearType);
		}
		public void display()
		{
			System.out.printf("Color: %s Door: %d GearType: %s%n",color, door, gearType);
		}
		
	}
