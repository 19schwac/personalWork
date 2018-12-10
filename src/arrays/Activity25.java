package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity25 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Double> wages = new ArrayList<Double>();
		System.out.println("How many employees");
		int employee = input.nextInt();
		for (int i = 0; i < employee; i++) {
			System.out.println("wage of employee");
			wages.add(input.nextDouble());
		}
		double highest = 0;
		for (double worker : wages) {
			if (worker > highest) {
				highest = worker;
			}
		}
		System.out.println("The highest wage " + highest);

	}
}
