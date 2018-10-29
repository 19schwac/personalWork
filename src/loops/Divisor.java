package loops;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		int divisor = 0;
		int largest = 0;
		int most = 0;
		for (num = 1; num <= 100000; num++) {
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
