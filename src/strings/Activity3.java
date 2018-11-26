package strings;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a name.");
		String sentence1 = input.nextLine();
		System.out.println("Write another name.");
		String sentence2 = input.nextLine();
		System.out.println("Comparison: " + sentence1.compareTo(sentence2));
		int order = sentence1.compareTo(sentence2);
		if (order < 0){
			System.out.println(sentence1 + "  comes first alphbetically");
		}
		if (order == 0){
			System.out.println("Names are the same.");
		}
		if (order > 0){
			System.out.println(sentence2 + "  comes first alphabetically");
		}
	}

}
