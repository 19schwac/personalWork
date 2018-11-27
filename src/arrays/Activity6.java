package arrays;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		for (int i = 0; i < names.length; i++){
			System.out.println("Please type a name:");
			names[i] = input.nextLine();
		}
		for (int j = names.length-1; j >= 0; j--){
			System.out.println(names[j]);
		}
	}

}
