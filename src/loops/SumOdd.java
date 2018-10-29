package loops;

import java.util.Scanner;

public class SumOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int counter = 0;
		int sum = 0;
		System.out.println("Please enter a number: ");
		num = input.nextInt();
		for (counter = 1; counter < num; counter = counter + 2) {
			sum = sum + counter;
		}
System.out.println("The sum of all the odd integers less than " + num + " is equal to " + sum);
	}
}