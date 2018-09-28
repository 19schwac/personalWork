package mathOperators;
import java.util.Scanner;
public class PullSSNApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		int ssn = 0;
		int newAge = 0;
		int ssn4 = 0;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your social security number?");
		ssn = input.nextInt();
		newAge = 18-age;
		ssn4 = ssn%10000;
		System.out.println("Your age: " + age);
		System.out.println("You will be 18 in " + newAge + "year(s).");
		System.out.println("Your social security number is " + ssn);
		System.out.println("The last four digits of your social security number is " + ssn4);
	
	}

}
