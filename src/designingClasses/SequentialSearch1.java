package designingClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SequentialSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 499;
		int j =0;
		Scanner input = new Scanner(System.in);
		Random genereator = new Random();
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++){
			int random = min + (int) (Math.random() * (max - min + 1));
			number.add(random);
		}
		System.out.println("What is a number?");
		int search = input.nextInt();
		for (int x: number){
			if (x==search){
				j++;
			}
		}
		System.out.println("This number was generated " + j + " times.");
	}

}
