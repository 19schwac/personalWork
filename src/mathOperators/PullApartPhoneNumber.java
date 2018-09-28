package mathOperators;
import java.util.Scanner;
public class PullApartPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int areaCode = 0;
		int number = 0;
		int middle = 0;
		int last = 0;
		System.out.println("What is your area code?");
		areaCode = input.nextInt();
		System.out.println("What is your phone number (no dashes)?");
		number = input.nextInt();
		middle = number/10000;
		last = number%10000;
		System.out.println("Your phone number is " + areaCode + "-" + middle + "-" + last);
		System.out.println("Area Code: " + areaCode);
		System.out.println("Middle Digits: " + middle);
		System.out.println("Last Digits: " + last);
		
	
		
		
	}

}
