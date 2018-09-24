package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int speedLimit = 0;
		int yourSpeed = 0;
		int cost = 0;
		System.out.println("What is the speed limit?");
		speedLimit = input.nextInt();
		System.out.println("How fast are you going?");
		yourSpeed = input.nextInt();
		cost = 55+40*((yourSpeed-1)-speedLimit);
		System.out.println("Speed Limit: " + speedLimit);
		System.out.println("Your Speed: " + yourSpeed);
		System.out.println("Your ticket will cost " + cost);
	}

}
