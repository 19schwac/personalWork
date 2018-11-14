package strings;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a name.");
		String sentence1 = input.nextLine();
		System.out.println("Write another name.");
		String sentence2 = input.nextLine();
		int order = sentence1.compareTo(sentence2);
		if (order < 0){
			System.out.println(sentence1.toUpperCase() + "  comes first alphbetically");
		}
		if (order == 0){
			System.out.println("Names are the same.");
		}
		if (order > 0){
			System.out.println(sentence2.toUpperCase() + "  comes first alphabetically");
		}
	}

}
