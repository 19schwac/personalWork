package arrays;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int min = 0;
		int max = words.length-1;
		int random = min + (int) (Math.random() * (max - min + 1));
		System.out.println(words[random]);
	}

}
