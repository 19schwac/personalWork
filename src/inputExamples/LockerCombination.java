package inputExamples;
import java.util.Scanner;
public class LockerCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		System.out.println("What is the first number of your locker combination?");
		number1 = input.nextInt();
		System.out.println("What is the second number of your locker combination?");
		number2 = input.nextInt();
		System.out.println("What is the first number of your locker combination?");
		number3 = input.nextInt();
		System.out.println("Your locker combination is " + number1 + " - " + number2 + " - " + number3);
	}

}
