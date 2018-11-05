package randomNumbers;

public class russianFirstGrader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 26;
		int max = 43;
		int child = 0;
		for (int count = 1; count <= 248; count++) {
			int random = min + (int) (Math.random() * (max - min + 1));
			if (random / 12 >= 3) {
				child++;
			}
		}
		System.out.println("The amount of children over 3 feet tall is approxmatley " + child + ".");
	}

}
