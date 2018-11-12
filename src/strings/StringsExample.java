package strings;

import java.util.Scanner;

public class StringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("What is your friends name?");
		String friend = input.next();
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
		System.out.println("Friend: " + friend);
	}

}
