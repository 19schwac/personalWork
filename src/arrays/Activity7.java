package arrays;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		for (int i = 0; i < names.length; i++){
			System.out.println("Please type a name:");
			names[i] = input.nextLine();
			
		}
		System.out.println("Type in a letter:");
		String letter = input.nextLine();
		
		for (int j = 0; j < names.length; j++){
			char lastLetter = (names[j].charAt(names[j].length() - 1));
			if (letter.charAt(0) == lastLetter){
				System.out.println(names[j]);
			}
		}
	}

}
