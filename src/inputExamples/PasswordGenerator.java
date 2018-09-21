package inputExamples;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		System.out.println("Type in a number with a single digit");
		number1 = input.nextInt();
		System.out.println("Type in a diffrent number with a single digit");
		number2 = input.nextInt();
		System.out.println("Type in one more diffrent number with just a single digit");
		number3 = input.nextInt();
		System.out.println("Your possible passwords are \n"
				+ number1 + + number2 + + number3 + "\n"
				+ number1 + + number3 + + number2 + "\n"
				+ number2 + + number1 + + number3 + "\n"
				+ number2 + + number3 + + number2 + "\n"
				+ number3 + + number1 + + number2 + "\n"
				+ number3 + + number2 + + number1);
		
	}

}
