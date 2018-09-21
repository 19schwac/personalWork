package inputExamples;
import java.util.Scanner;
public class InputVote {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean answer = false;
		System.out.println("True or False? Did you vote?");
		answer = input.nextBoolean();
		System.out.println("Did you vote? " + answer);
	}

}
