package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int weight = 0;
		int age = 0;
		int luckynumber = 0;
		System.out.print("Enter your weight: ");
		weight = input.nextInt();
		System.out.print("Enter your age: ");
		age = input.nextInt();
		System.out.print("Enter your lucky number: ");
		luckynumber = input.nextInt();
		System.out.print("In the future..."
				+ "\nI see..."
				+ "\n43 years from now..."
				+ "\nYou will be resident number 17180"
				+ "\nat the old folks home.");
	}

}
