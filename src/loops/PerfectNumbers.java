package loops;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int divisor = 0;
		int sum = 0;
		int count = 0;
		for (int factor = 1; factor <= 1000; factor++) {
			for (count = 1; count < factor; count++) {
				if (factor % count == 0) {
					sum = sum + count;
				}

			}
			if (sum == count) {
				System.out.println(count);

			}
			sum = 0;
		}
	}

}
