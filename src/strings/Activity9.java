package strings;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int verify = 0;
		do{
		System.out.println("Write a password.");
		String sentence1 = input.nextLine();
		System.out.println("Please verify the password.");
		String sentence2 = input.nextLine();
		verify = sentence1.compareTo(sentence2);
		}while(verify != 0);
	}

}
