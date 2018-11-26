package strings;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write your social security number without dashes.");
		String sentence = input.nextLine();
		System.out.println(sentence.substring(5));
		System.out.println(sentence.substring(3, 5));
		System.out.println(sentence.substring(0,3));
	}

}
