package decisions;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double salary = 0.0;
		System.out.println("How much do you make in a year?");
		salary = input.nextDouble();

		if (salary > 0 && salary <= 20000) {
			System.out.println("You are a worker.");
		} else {
			if (salary >= 20000 && salary <= 40000)
				System.out.println("You are in management.");
			else {
				if (salary >= 40000 && salary <= 60000) {
					System.out.println("You are a CEO.");
				} else {
					if (salary >= 60000){
						System.out.println("You are an owner.");
					}
				}
			}
		}
	}
}
