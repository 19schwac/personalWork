package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob Smith");
		names.add("Jane Miller");
		names.add(0, "Billy Jones");
		System.out.println("Enter your name?");
		names.add(input.nextLine());
	}

}
