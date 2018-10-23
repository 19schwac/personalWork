package loops;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		double big = 0.0;
		System.out.println("Please enter a number. (9999 to quit): ");
		num = input.nextDouble();
		while (num != 9999) {
			if (num > big){
				big = num;
			}
			System.out.println("Please enter a number. (9999 to quit): ");
			num = input.nextDouble();
		}
		System.out.println("The largest number is " + big);
	}

}
