package decisions;

import java.util.Scanner;

public class Promotions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean job = false;
		int years = 0;
		System.out.println("Are you a sales person?");
		job = input.nextBoolean();
		System.out.println("How many years of experinece do you have");
		years = input.nextInt();
		if (job == true && years >= 3 || job == false && years >= 5) {
			System.out.println("You are getting a promotion.");
		} else {
			System.out.println("You do not have a promtion.");
		}
	}

}
