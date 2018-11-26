package arrays;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] testScores = new int[25000];
		int score = 0;
		for (int count = 0; count <= 24999; count++) {
			System.out.println("What was your test score?");
			score = input.nextInt();
			testScores[count] = score;
		}
		for (int i = 24999; i >= 0; i--) {
			System.out.println(testScores[i]);
		}

	}

}
