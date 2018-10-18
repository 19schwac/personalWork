package decisions;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double gpa = 0.0;
		int grade = 0;
		System.out.println("What is your GPA?");
		gpa = input.nextDouble();
		System.out.println("What grade are you?");
		grade = input.nextInt();
		System.out.println("I hope your having a great day!");
		if (grade == 12 && gpa >= 3.5) {
			System.out.println("You are graduating with honors.");
		}
		else {
			System.out.println("You are not graduating with honors.");
		}
	}

}
