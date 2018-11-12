package randomNumbers;

public class flipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 2;
		int heads = 0;
		int tails = 0;
		for (int count = 1; count <= 100000; count++) {
			int random = min + (int) (Math.random() * (max - min + 1));
			if (random == 1) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Heads: " + heads + " Tails: " + tails);
	}

}
