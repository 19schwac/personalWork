package mathOperators;
import java.util.Scanner;
public class howManyYearsUntilVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.println("What is your age?");
		age = input.nextInt();
		age = 18- age;
		System.out.println("It will be " + age + " year(s) before you can vote.");
	}

}
