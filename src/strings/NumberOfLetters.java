package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int vowel = 0;
		int constants = 0;
		int punctuation = 0;
		int length = 0;
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		for (int i = 0; i <= sentence.length() - 1; i++) {
			if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
					|| sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'y') {
				vowel++;
			}
		}
		System.out.println("Number of vowels: " + vowel);
	}
}
