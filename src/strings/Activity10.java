package strings;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		for (int i = 1; i < sentence.length()+1; i++) {
			if (i % 4 == 0) {
				System.out.println(sentence.charAt(i-1));
			}
		}
	}

}
