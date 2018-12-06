package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Christian");
		names.add("Josh");
		names.add("Kenny");
		System.out.println("Enter your name: ");
		for (int i = names.size()-1; i >= 0; i--){
			String temporaryName = names.get(i);
			System.out.println(names);
			
		}
	}

}
