package arrays;

import java.util.Scanner;

public class Activity24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in the class?");
		int num = input.nextInt();
		int[] students = new int[num];
		for (int i = 0; i <= students.length - 1; i++) {
			System.out.println("What is the age of the student?");
			students[i] = input.nextInt();
		}
		double sum = 0;
		for (int x: students){
			sum = (sum + x);
		}
		double ave = sum/students.length;
		System.out.println(ave);
	}

}
