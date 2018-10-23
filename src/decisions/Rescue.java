package decisions;

import java.util.Scanner;

public class Rescue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = 0;
		int helicopter = 0;
		System.out.println("How many people need to be saved?");
		people = input.nextInt();
		helicopter = people / 10;
		System.out.println("You will need " + helicopter + " helicopter(s).");
		if ( helicopter == people / 10 && 0 == people % 10) {
			System.out.println("Mission Success.");
		} else {
			int newPeople = (people % 10);
			System.out.println("Dead people: " + newPeople);
		}
	}
}
