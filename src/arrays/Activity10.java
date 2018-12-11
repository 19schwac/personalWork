package arrays;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0));

		}
	}
}
