package loops;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int items = 0;
		double cost = 0;
		double total = 0;
		int count = 0;
		System.out.println("How many items did you buy?");
		items = input.nextInt();
		for (count = 0; count < items; count++) {
			System.out.println("What is the cost of your item");
			cost = input.nextDouble();
			total = total + cost;
		}
System.out.println("Your total cost is: $" + total);
	}

}
