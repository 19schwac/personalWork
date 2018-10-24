package loops;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int large = 0;
		System.out.println("Please enter a number");
		num = input.nextInt();
		do {
			if (num > large) {
				large = num;
			}
			System.out.println("Please enter a number (9999 to quit): ");
			num = input.nextInt();
		} while (num != 9999);
		System.out.println("The largest number is: " + large);
	}

}
