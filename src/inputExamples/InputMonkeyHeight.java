package inputExamples;
import java.util.Scanner;
public class InputMonkeyHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Double height = 0.0;
Scanner input = new Scanner(System.in);
System.out.println("How tall is a monkey in feet?");
height = input.nextDouble();
System.out.println("A monkey is " + height + " ft tall.");
	}

}
