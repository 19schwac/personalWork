package decisions;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height = 0.0;
		double weight = 0.0;
		int age = 0;
		double luckyNumber = 0.0;
		System.out.println("What is your age?");
		age = input.nextInt();
		if (age <= 18 && age > 0) {
			System.out.println("What is your weight?");
			weight = input.nextDouble();
			luckyNumber = weight / 2;
			System.out.println("Your lucky number is " + luckyNumber);
		} else {
			if (age > 0) {
				System.out.println("What is your height?");
				height = input.nextDouble();
				luckyNumber = height * 5;
				System.out.println("Your lucky number is " + luckyNumber);
			}
		}
	}
}
