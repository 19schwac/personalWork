package inputExamples;
import java.util.Scanner;
public class InputAgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		double weight = 0.0;
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("You are " + age + " years old \n");
		System.out.println("How much do you weigh?");
		weight = input.nextDouble();
		System.out.println("You weigh " + weight + " lbs.");
	}

}
