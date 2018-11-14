package strings;

import java.util.Scanner;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != 'a' && sentence.charAt(i) != ' ') {
				System.out.print(sentence.charAt(i));
			}
		}
	}

}
