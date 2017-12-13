package day19;

public class P1 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit){
			System.out.println("f�� Unit Ŭ������ �ڼ��Դϴ�.");
		}
		
		
		
		
	}
}
class Fighter extends Unit implements Fightable{

	@Override
	public void move() {
		
	}
	@Override
	public void attack(Unit u) {
		
	}
	
}
class Unit{
	int HP;
	int x;
	int y;
}
interface Fightable extends Movable, Attackable{

}
interface Movable{
	void move();
}
interface Attackable{
	void attack(Unit u);
}
