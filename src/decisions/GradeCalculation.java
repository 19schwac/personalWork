package decisions;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double test = 0.0;
		double homework = 0.0;
		boolean nice = false;
		System.out.println("What is your test average?");
		test = input.nextDouble();
		System.out.println("What is your homework average?");
		homework = input.nextDouble();
		if (test >= homework) {
			System.out.println("Is your teacher nice?");
			nice = input.nextBoolean();
			if (nice == true) {
				System.out.println("Your grade in this class is " + test);
			} else {
				System.out.println("Your grade in this class is " + homework);

			}
		}
		else{
			System.out.println("Is your teacher nice?");
			nice = input.nextBoolean();
			if (nice == true) {
				System.out.println("Your grade in this class is " + homework);
			} else {
				System.out.println("Your grade in this class is " + test);

			}
		}
	}

}
