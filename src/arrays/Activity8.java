package arrays;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		int total = 0;
		String firstName = "";
		for (int i = 0; i < names.length; i++){
			System.out.println("Please type a name:");
			names[i] = input.nextLine();
			
		}
		System.out.println("What should the length of the first name be?");
		int firstLength = input.nextInt();
		for (int j = 0; j < names.length; j++){
			int length = (names[j].indexOf(' '));
			if (firstLength == length){
				total++;
			}
		}
		System.out.println("The names you inputed matched the length " + total + " times.");
	}

}
