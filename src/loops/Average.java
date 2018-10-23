package loops;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		double sum = 0.0;
		int count = 0;
		double average = 0.0;
		System.out.println("Please enter a number. (9999 to quit): ");
		num = input.nextInt();
		while (num != 9999) {
			count ++;
			sum = sum + num;
			System.out.println("Please enter a number. (9999 to quit): ");
			num = input.nextInt();
		}
		average = sum/count;
		System.out.println("The average of the numbers is: " + average);
	}

}
