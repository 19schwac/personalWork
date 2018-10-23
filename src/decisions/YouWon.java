package decisions;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double money = 0.0;
		double epsilon = 0.005;
		System.out.println("how much money did you recieve on your fith birthday?");
		money = input.nextDouble();
		if (Math.abs(money-Math.sqrt(84.3)) < epsilon)
		{
			System.out.println("You won a good prize.");
		} 
		else 
		{
			System.out.println("You won a bad prize.");
		}
	}

}
