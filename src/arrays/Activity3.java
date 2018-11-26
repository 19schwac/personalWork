package arrays;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] testScores = new int[25000];
		int score = 0;
		int sum = 0;
		for (int count = 0; count <= 24999; count++) {
			System.out.println("What was your test score?");
			score = input.nextInt();
			testScores[count] = score;
		}
		for (int i = 0; i <= 24999; i++) {
			sum = sum + testScores[i];
		}
		System.out.println(sum);
	}

}
