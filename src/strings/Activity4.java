package strings;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int length = 0;
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		if (sentence.indexOf('x') > 0) {
			length = sentence.indexOf('x') - 1;
			System.out.println("The first time x was used was the " + length + "th character.");
		} else {
			System.out.println("x was not used.");
		}
	}
}
