package decisions;

import java.util.Scanner;

public class PostIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double sticky = 0.0;
		boolean unit = false;
		System.out.println("What is the length of the board in inches or feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the board in inches or feet?");
		width = input.nextInt();
		System.out.println("Did you use inches?");
		unit = input.nextBoolean();
		if (unit == true) {
			sticky = (length*width)/9;
			System.out.println("You will need " + sticky + " sticky notes to cover the board.");
		} else {
			sticky = (length*width*12)/9;
			System.out.println("You will need " + sticky + " sticky notes to cover the board.");
		}
	}

}
