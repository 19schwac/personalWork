package arrays;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 1000;
		int largest = 0;
		int[] testScores = new int[250];
		for (int count = 0; count <= 249; count++) {
			int random = min + (int) (Math.random() * (max - min + 1));
			testScores[count] = random;
			if (testScores[count] >= largest){
				largest = testScores[count];
			}
		}
		System.out.println(largest);
	}

}
