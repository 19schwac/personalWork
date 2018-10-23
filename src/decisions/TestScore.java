package decisions;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test1 = 0;
		int test2 = 0;
		System.out.println("What was the largest test score?");
		test1 = input.nextInt();
		System.out.println("What was the smallest test score?");
		test2 = input.nextInt();
		if (test1 > test2)
		{
		System.out.println("Great Job!");
		int diffrence = test1-test2;
		System.out.println("The diffrence of the test scores is " + diffrence);
		}
		System.out.println("Have a nice day!");
	}

}
