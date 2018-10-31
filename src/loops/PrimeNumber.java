package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int divisor = 0;
		num = input.nextInt();
		for (int count = 1; count < num; count++) {
			if (num % count == 0) {
				divisor++;
			}
		}
		if (divisor == 1) {
			System.out.println("Prime");
		}
	}

}
