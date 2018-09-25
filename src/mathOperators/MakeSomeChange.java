package mathOperators;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double initialValue = 0.00;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		final double DOLLAR = 1.00;
		final double QUARTER = 0.25;
		final double DIME = 0.10;
		final double NICKLE = 0.05;
		final double PENNIES = 0.01;
		System.out.println("How much money do you have?");
		initialValue = input.nextDouble();
		dollars = (int)(initialValue/DOLLAR);
		
		
	}

}
