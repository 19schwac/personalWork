package arrays;

import java.util.Scanner;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int row = 4;
		int column = 3;
		String[][] names = new String[row][column];

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[0].length; j++) {
				System.out.println("Write a name.");
				String sentence = input.nextLine();
				names[i][j] = sentence;
			}
		}
		for (int k = 0; k < names.length; k++) {
			for (int l = 0; l < names[0].length; l++) {
				System.out.print(" " + names[k][l].length());
			}
			System.out.println();
		}
	}
}
