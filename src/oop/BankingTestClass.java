package oop;
import java.util.Scanner;
public class BankingTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Banking bob = new Banking ();
System.out.println("What amount would you like to deposit?");
double deposit = input.nextDouble();
bob.deposit(deposit);
	}

}
