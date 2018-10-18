package decisions;

import java.util.Scanner;

public class CutGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double radius = 0.0;
		boolean cut = false;
		double money = 0.0;
		System.out.println("What is the length of the front yard in feet?");
		length = input.nextInt();
		System.out.println("What is the width of the front yard in feet?");
		width = input.nextDouble();
		System.out.println("Did you cut the back yard?");
		cut = input.nextBoolean();
		money = (length * width) / 100.0;
		if (cut == true) {
			System.out.println("What is the radius of the back yard in feet?");
			radius = input.nextDouble();
			money = money + (1.50) * (Math.PI * radius * radius) / 75.0;
		}
System.out.println("You are making $" + money);
	}

}
