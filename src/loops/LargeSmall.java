package loops;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test = 0;
		int large = 0;
		System.out.println("What is your test score?");
		test = input.nextInt();
		int small = test;
		while (test != 9999) {
			if (test > large) {
				large = test;
			}
			if (test < small) {
				small = test;
			}
			System.out.println("What is another test score (9999 to quit)");
			test = input.nextInt();
		}
		System.out.println("Your largest test score is: " + large);
		System.out.println("Your smallest test score is: " + small);
	}

}
