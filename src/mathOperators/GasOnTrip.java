package mathOperators;
import java.util.Scanner;
public class GasOnTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double distance = 0.00;
		double money = 0.00;
		double mpg = 0.00;
		double gallons = 0.00;
		double averageCost = 0.00;
		System.out.println("What is the distance of your trip in miles?");
		distance = input.nextDouble();
		System.out.println("What is the MPG for your car?");
		mpg = input.nextDouble();
		System.out.println("How much money did you spend on a gallon of gas?");
		money = input.nextInt();
		System.out.println("You traveled " + distance + " miles.");
		gallons = (1/mpg)*distance;
		System.out.println("You used " + gallons + " gallons of gas.");
		averageCost = gallons*money;
		System.out.println("The average cost of gas is $" + averageCost);
		
	}

}
