package loops;

import java.util.Scanner;

public class PrimeFactorizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		num = input.nextInt();
		for (int count = 2; count < num; count++) {
			while (num % count == 0) {
				System.out.println(count + " ");
				num = num / count;
			}
		}
		if (num > 2) {
			System.out.println(num);
		}
	}
}
