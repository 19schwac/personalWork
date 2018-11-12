package strings;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		System.out.println("First letter: " + sentence.charAt(0));
		System.out.println("Third letter: " + sentence.charAt(3));

	}

}
