package arrays;

import java.util.Scanner;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total = 0;
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		System.out.println("What is the key word?");
		String keyword = input.nextLine();
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (keyword.equals(words[i]) == true) {
				total++;
			}
		}
		System.out.println("The keyword was used " + total + " times.");
	}
}
