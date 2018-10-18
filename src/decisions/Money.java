package decisions;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		double gpa = 0.0;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your GPA?");
		gpa = input.nextDouble();
		if (gpa + age > 20) {
			System.out.println("You get $250");
		}
		if (gpa + age <= 20) {
			System.out.println("You get $30");
		}
	}

}
