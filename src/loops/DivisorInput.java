package loops;
import java.util.Scanner;
public class DivisorInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int num = 0;
		int divisor = 0;
		int largest = 0;
		int most = 0;
		int end = 0;
		System.out.println("What number should we count up to to calculate its divisor?");
		end = input.nextInt();
		for (num = 1; num <= end; num++) {
			divisor = 0;
			for (count = 1; count <= num; count++) {
				if (num % count == 0) {
					divisor++;
					if (divisor > most) {
						most = divisor;
						largest = num;
					}
				}
			}

		}
		System.out.println(largest);
	}

}
