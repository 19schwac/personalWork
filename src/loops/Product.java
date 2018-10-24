package loops;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Please enter a number");
		num = input.nextInt();
		do {
			int product = num * 17;
			System.out.println("Magic Product is: " + product);
			System.out.println("Please enter a number (9999 to quit): ");
			num = input.nextInt();
		} while (num != 9999);
	}

}
