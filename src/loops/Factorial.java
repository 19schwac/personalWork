package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int factorial = 1;
		System.out.println("Please input a positive number: ");
		num = input.nextInt();
		for (count = num; count >= 1; count = count - 1) {
			factorial = factorial * count;
		}
		System.out.println("The factorial of your number is equal to: " + factorial);
	}

}
