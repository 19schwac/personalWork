package strings;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence with bob in it.");
		String sentence = input.nextLine();
		System.out.println("Did you do it: " + sentence.contains("bob"));
		System.out.println("The sentence is: " + sentence);
	}

}
