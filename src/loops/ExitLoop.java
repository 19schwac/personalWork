package loops;

import java.util.Scanner;

public class ExitLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		double sum = 0.0;
		System.out.println("Please enter a number. (9999 to quit): ");
		num = input.nextInt();
		while (num != 9999) {
			sum = sum + num;
			System.out.println("Please enter a number. (9999 to quit): ");
			num = input.nextInt();
		}
		System.out.println("The sum of the number is: " + sum);
	}

}
