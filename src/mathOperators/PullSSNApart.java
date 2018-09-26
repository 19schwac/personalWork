package mathOperators;
import java.util.Scanner;
public class PullSSNApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		int ssn1 = 0;
		int ssn2 = 0;
		int ssn3 = 0;
		int ssn4 = 0;
		int ssn5 = 0;
		int ssn6 = 0;
		int ssn7 = 0;
		int ssn8 = 0;
		int ssn9 = 0;
		int newAge = 0;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is the first number of your social security number?");
		ssn1 = input.nextInt();
		System.out.println("What is the second number of your social security number?");
		ssn2 = input.nextInt();
		System.out.println("What is the third number of your social security number?");
		ssn3 = input.nextInt();
		System.out.println("What is the fourth number of your social security number?");
		ssn4 = input.nextInt();
		System.out.println("What is the fith number of your social security number?");
		ssn5 = input.nextInt();
		System.out.println("What is the sixth number of your social security number?");
		ssn6 = input.nextInt();
		System.out.println("What is the seventh number of your social security number?");
		ssn7 = input.nextInt();
		System.out.println("What is the eigth number of your social security number?");
		ssn8 = input.nextInt();
		System.out.println("What is the ninth number of your social security number?");
		ssn9 = input.nextInt();
		System.out.println("You are " + age + " years old");
		newAge= 18-age;
		System.out.println("You will be 18 in " + newAge + " year(s)");
		System.out.println("Your social security number is " + ssn1 + + ssn2 + + ssn3 + + ssn4 + + ssn5 + + ssn6 + + ssn7 + + ssn8 + + ssn9);
		System.out.println("The last 4 digits of your social security number are " + ssn6 + +ssn7 + + ssn8 + + ssn9);
		
	
	}

}
