package decisions;

import java.util.Scanner;

public class CostInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		double weight = 0.0;
		double money = 200.0;
		boolean smoke = false;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextDouble();
		System.out.println("Do you smoke?");
		smoke = input.nextBoolean();
		if (age >= 75) {
			money = money + 125;
		} else {
			money = money - 25;
		}
		if (weight >= 700) {
			money = money + 125;
		}
		if (smoke == true) {
			money = money + 50;
		} else {
			money = money - 40;
		}
		System.out.println("You have to pay $" + money);
	}

}
