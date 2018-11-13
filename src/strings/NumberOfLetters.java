package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int vowel = 0;
		int consonants = 0;
		int punctuation = 0;
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == 'a' || 
				sentence.charAt(i) == 'e' || 
				sentence.charAt(i) == 'i' || 
				sentence.charAt(i) == 'o' || 
				sentence.charAt(i) == 'u' || 
				sentence.charAt(i) == 'y') {
				vowel++;
			}
			if (sentence.charAt(i) == 'b'||
				sentence.charAt(i) == 'c'||
				sentence.charAt(i) == 'd'||
				sentence.charAt(i) == 'f'||
				sentence.charAt(i) == 'g'||
				sentence.charAt(i) == 'h'||
				sentence.charAt(i) == 'j'||
				sentence.charAt(i) == 'k'||
				sentence.charAt(i) == 'l'||
				sentence.charAt(i) == 'm'||
				sentence.charAt(i) == 'n'||
				sentence.charAt(i) == 'p'||
				sentence.charAt(i) == 'q'||
				sentence.charAt(i) == 'r'||
				sentence.charAt(i) == 's'||
				sentence.charAt(i) == 't'||
				sentence.charAt(i) == 'v'||
				sentence.charAt(i) == 'w'||
				sentence.charAt(i) == 'x'||
				sentence.charAt(i) == 'z'){
				consonants++;
			}
			if (sentence.charAt(i) == '.'||
				sentence.charAt(i) == ','||	
				sentence.charAt(i) == '?'||
				sentence.charAt(i) == '!'||
				sentence.charAt(i) == '-'||
				sentence.charAt(i) == '_'){
				punctuation++;
			}
		}
		System.out.println("Number of vowels: " + vowel);
		System.out.println("Number of consonants: " + consonants);
		System.out.println("Number of punctuation: " + punctuation);
	}
}
