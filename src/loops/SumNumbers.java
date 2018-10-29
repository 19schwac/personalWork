package loops;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do {
			sum = num + sum;
			System.out.println("Please enter a number (999 to quit)");
			num = input.nextInt();
		} while (num != 999);
		System.out.println("The sum of the numbers is: " + sum);

	}

}
