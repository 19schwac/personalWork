package loops;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test = 0;
		int sum = 0;
		int count = 0;
		System.out.println("What is your first test score?");
		test = input.nextInt();
		while (test != 9999) {
			count+= 1;
			sum = sum + test;
			System.out.println("What is your next test score (9999 to quit)");
			test = input.nextInt();
		}
		System.out.println("The sum of your test scores is: " + sum);
		int average = sum / count;
		System.out.println("The average of your test scores is: " + average);

	}

}
