package loops;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int large = 0;
		System.out.println("Please enter a number");
		num = input.nextInt();
		int small = num;
		do {
			if (num > large) {
				large = num;
			} else {
				if (num < small) {
				small = num;
			}
			}
			System.out.println("Please enter a number (9999 to quit): ");
			num = input.nextInt();
		} while (num != 9999);
		int range = large - small;
		System.out.println("Range is: " + range);
	}

}
