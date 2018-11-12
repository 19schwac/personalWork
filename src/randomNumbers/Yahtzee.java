package randomNumbers;

public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 6;
		boolean yahtzee = false;
		int trial = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		while (yahtzee == false) {
			for (int roll = 1; roll <= 5; roll++) {
				trial++;
				int random = min + (int) (Math.random() * (max - min + 1));
				if (random == 1) {
					one++;
				}
				if (random == 2) {
					two++;
				}
				if (random == 3) {
					three++;
				}
				if (random == 4) {
					four++;
				}
				if (random == 5) {
					five++;
				}
				if (random == 6) {
					six++;
				}
			}
			if (one == 5) {
				yahtzee = true;
			}
			if (two == 5) {
				yahtzee = true;
			}
			if (three == 5) {
				yahtzee = true;
			}
			if (four == 5) {
				yahtzee = true;
			}
			if (five == 5) {
				yahtzee = true;
			}
			if (six == 5) {
				yahtzee = true;
			}
			
			one = 0;
			two = 0;
			three = 0;
			four = 0;
			five = 0;
			six = 0;
		}
		System.out.println("Yahtzee! it took " + trial + " times to get it.");
	}

}
