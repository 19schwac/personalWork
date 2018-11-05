package randomNumbers;

public class thirteenSidedDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 13;
		int multiple = 0;

		for (int count = 1; count <= 87; count++) {
			int random = min + (int) (Math.random() * (max - min + 1));
			if (random % 3 == 0) {
				multiple++;
			}
		}
		System.out.println("A multiple of three was rolled " + multiple + " times.");
	}
}
