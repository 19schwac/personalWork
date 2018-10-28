package loops;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Give me a whole number?");
		num = input.nextInt();
		while (num != -1) {
			num = num * num * num;
			System.out.println("Your number cubed is: " + num);
			System.out.println("Give me a whole number(-1 to quit)?");
			num = input.nextInt();
		}

	}

}
