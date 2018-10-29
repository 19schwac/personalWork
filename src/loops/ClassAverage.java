package loops;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int test = 0;
		int students = 0;
		int score = 0;
		int sum = 0;
		System.out.println("How many students took the test?");
		students = input.nextInt();
		for (test = 1; test <= students; test++) {
System.out.println("What is the test score: ");
score = input.nextInt();
sum = score + sum;
		}
		int ave = sum/students;
		System.out.println("The average test score is: " + ave);
	}

}
