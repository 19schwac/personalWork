package mathOperators;
import java.util.Scanner;
public class SumOfAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age1 = 0;
		int age2 = 0;
		int age3 = 0;
		int total = 0;
		System.out.println("What is the first person's age?");
		age1 = input.nextInt();
		System.out.println("What is the second person's age?");
		age2 = input.nextInt();
		System.out.println("What is the third person's age?");
		age3 = input.nextInt();
		total = age1 + age2 + age3;
		System.out.println("Your total ages is equal to " + total);
	}

}
