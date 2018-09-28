package mathOperators;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double initialValue = 0.00;
		double newValue= 0.00;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		final int DOLLAR = 100;
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKLE = 5;
		final int PENNIES = 1;
		System.out.println("How much money do you have?");
		initialValue = input.nextDouble();
		newValue = initialValue*100.0;
		dollars = (int) (newValue/DOLLAR);
		newValue = (newValue-dollars*DOLLAR);
		quarters = (int)(newValue/QUARTER);
		newValue = (newValue-quarters*QUARTER);
		dimes = (int)(newValue/DIME);
		newValue = (newValue-dimes*DIME);
		nickels = (int)(newValue/NICKLE);
		newValue = (newValue-nickels*NICKLE);
		pennies = (int)(newValue/PENNIES);
		System.out.println("You have $" + initialValue + " dollars. You change is");
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: "+ quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		
		
	}

}
