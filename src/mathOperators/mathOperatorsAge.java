package mathOperators;
import java.util.Scanner;
public class mathOperatorsAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.println("What is your age?");
		age = input.nextInt();
		age = age + 7;
		System.out.println("You will be " + age + " years old in 7 years");
	}

}
