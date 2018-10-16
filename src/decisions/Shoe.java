package decisions;

import java.util.Scanner;

public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int height = 0;
		int shoeSize = 0;
		System.out.println("What is your height?");
		height = input.nextInt();
		System.out.println("What is your shoe size?");
		shoeSize = input.nextInt();
		System.out.println(height + shoeSize >= 26);
	}

}
