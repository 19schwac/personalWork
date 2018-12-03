package arrays;

import java.util.Scanner;
import java.util.Random;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 0;
		int max = 100;
		int row = 14;
		int column = 9;
		int[][] numbers = new int[row][column];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				int random = min + generator.nextInt(max - min + 1);
				numbers[i][j] = random;
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
