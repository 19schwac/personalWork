package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random genereator = new Random();
		ArrayList<String> names = new ArrayList<String>();
		names.add("Christian");
		names.add("Josh");
		names.add("Kenny");
		names.remove(0);
		names.remove(names.size()-1);
		System.out.println(names);
		

		
	}

}
