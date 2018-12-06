package arrays;

import java.util.Random;
import java.util.Scanner;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 0;
		int max = 50;
		int row = 3;
		int column = 7;
		int depth = 9;
		int sum = 0;
		int[][][] numbers = new int[row][column][depth];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				for (int k = 0; k < numbers[0][0].length; k++){
				int random = min + generator.nextInt(max - min + 1);
				numbers[i][j][k] = random;
				sum += numbers[i][j][k];
				}
			}
		}
		System.out.println(sum);
	}

}
