package day16;

public class DiceGame {

	public static void main(String[] args) {
		
		DiceGame game = new DiceGame();
		
		try {
			int result1 = game.countSameEye(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally{
			
		}
		
	}
	int countSameEye(int n) throws Exception{
		if(n < 0){
			throw new Exception("À½¼ö NO");
		}
		int count = 0;
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		
		for(int i = 0; i < 9; i++){
			if(dice1.play() == dice2.play()) count++;
		}
		
		
		return 0;
	}
}

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;

	}
}
