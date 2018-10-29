package loops;

public class DivisorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		int divisor = 0;
		for (num = 1; num <= 60; num++) {
			divisor = 0;
			for (count = 1; count <= num; count++) {
				if (num % count == 0) {
					divisor++;
					System.out.println(divisor);
				}
			}
		}

	}
}
