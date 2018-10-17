package decisions;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		boolean extraCredit = false;
		System.out.println("What is your first test score?");
		test1 = input.nextInt();
		System.out.println("What is your second test score?");
		test2 = input.nextInt();
		System.out.println("What is your third test score?");
		test3 = input.nextInt();
		System.out.println("Did you do the extra credit?");
		extraCredit = input.nextBoolean();
		double testAve = (test1 + test2 + test3) / 3;
		if (extraCredit == true) {
			System.out.println("You earned 5 extra percentage points!");
			testAve = testAve + 5;
			System.out.println("Test Average: " + testAve);
		} 
		if (extraCredit == false) {
		System.out.println("Test Average: " + testAve);
		}
	}

}
