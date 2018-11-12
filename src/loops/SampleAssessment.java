package loops;

import java.util.Scanner;

public class SampleAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("What's the three digit number?");
		int num = input.nextInt();
		if (num%2 != 0) {
			num = num+1;
		}
		for (int count = num; count < 1000; count = count + 2) {
			sum = count + sum;
		}
		int finalSum = sum + 1000;
		System.out.println(finalSum);
	}
}
