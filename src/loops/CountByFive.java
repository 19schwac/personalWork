package loops;

import java.util.Scanner;

public class CountByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		System.out.println("What number should we count up to?");
		count = input.nextInt();
		while (num <= count) {
			System.out.println(num);
			num = num + 5;

		}
	}

}
