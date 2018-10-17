package decisions;

import java.util.Scanner;

public class PetsAndGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pet = 0;
		int car = 0;
		System.out.println("How many pets are in your house?");
		pet = input.nextInt();
		System.out.println("How many cars fit in your garage?");
		car = input.nextInt();
		System.out.println(pet >= 5 || car > 3);
	}

}
