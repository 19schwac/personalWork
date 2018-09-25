package mathOperators;
import java.util.Scanner;
public class BusesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = 0;
		int buses = 0;
		int leftover = 0;
		System.out.println("How many people need to be transported?");
		people = input.nextInt();
		buses = people/35;
		leftover = people%35;
		System.out.println("There are " + people + " people that need to be transported");
		System.out.println("You will need " + buses + " buses and " + leftover + " people will be left over.");
	}

}
