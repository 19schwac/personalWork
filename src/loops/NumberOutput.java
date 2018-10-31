package loops;

public class NumberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		for (count = 0; count <= 5; count++) {
			for (num = count; num <= 5; num++) {
				if (num != count) {
					System.out.print(num + " ");
				} else {
					if (num == 0) {

					} else {

						System.out.println(count);
					}
				}
			}
		}

	}
}
