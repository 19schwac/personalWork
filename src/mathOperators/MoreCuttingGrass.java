package mathOperators;
import java.util.Scanner;
public class MoreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double mowerDeck = 0.0;
		double mph = 0.0;
		double time = 0.0;
		double money = 0.0;
		double areaOfLawn = 0.0;
		double feetPerHour = 0.0;
		final double PAY = 12.0;
		System.out.println("What is the length of your yard in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of your yard in feet?");
		width = input.nextDouble();
		System.out.println("What is the width of the length of the mower deck in inches?");
		mowerDeck = input.nextDouble();
		System.out.println("How fast is your lawn mower (mph)?");
		mph = input.nextDouble();
		areaOfLawn = length*width;
		feetPerHour = (mph*5280.0)*(mowerDeck/12.0);
		time = areaOfLawn/feetPerHour;
		money = PAY*time;
		System.out.println("Time to mow lawn: " + time + "hours");
		System.out.println("Pay: $" + money);
	}

}
